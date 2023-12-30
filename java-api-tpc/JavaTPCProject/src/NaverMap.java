import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;

import javax.swing.ImageIcon;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import kr.inflearn.AddressVO;

public class NaverMap implements ActionListener {
	Project01_F naverMap;
	
	public static final String clientId = "t3owlgd2hw";                                  
	public static final String clientSecret = "lrxfxbekfHZIJdLTJ566GQV0eXZm9kPhzZnrtCuO";
	
	public NaverMap(Project01_F naverMap) {
		this.naverMap = naverMap;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		AddressVO vo = null;
		try {
			String address = naverMap.address.getText();
			String addr = URLEncoder.encode(address, "UTF-8");
			
			String url = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=" + addr;
			URL apiUrl = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) apiUrl.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
			conn.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);
			
			int responseCode = conn.getResponseCode();
			BufferedReader br;
			if(responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			
			JSONTokener tokener = new JSONTokener(response.toString());
			JSONObject object = new JSONObject(tokener);
			System.out.println(object);
		
			JSONArray addresses = object.getJSONArray("addresses");
			for(int i = 0; i < addresses.length(); i++) {
				JSONObject obj = (JSONObject) addresses.get(i);
				
				vo = new AddressVO();
				vo.setRoadAddress((String) obj.get("roadAddress"));
				vo.setJibunAddress((String) obj.get("jibunAddress"));
				vo.setX((String) obj.get("x"));
				vo.setY((String) obj.get("y"));
				
				System.out.println(vo);
			}
			createMapImage(vo);
		} catch (Exception err) {
			err.getStackTrace();
		}	
	}
	
	public void createMapImage(AddressVO vo) {
		String url = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		try {
			String pos = URLEncoder.encode(vo.getX() + " " + vo.getY(), "UTF-8");
			url += "center=" + vo.getX() + "," + vo.getY();
			url += "&level=16&w=700&h=500";
			url += "&markers=type:t|size:mid|pos:" + pos + "|label:" + URLEncoder.encode(vo.getRoadAddress(), "UTF-8");

			URL mapUrl = new URL(url);
			
			HttpURLConnection conn = (HttpURLConnection) mapUrl.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
			conn.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);
			
			int responseCode = conn.getResponseCode();
			
			if(responseCode == 200) {
				InputStream is = conn.getInputStream();
				int read = 0;
				byte[] bytes = new byte[1024];
				String timeName = Long.valueOf(new Date().getTime()).toString();
				File jpgFile = new File(timeName + ".jpg");
				jpgFile.createNewFile();
				
				OutputStream outputStream = new FileOutputStream(jpgFile);
				while ((read = is.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}
				
				ImageIcon imageIcon = new ImageIcon(jpgFile.getName());
				naverMap.imageLabel.setIcon(imageIcon);
				naverMap.resAddress.setText(vo.getRoadAddress());
				naverMap.jibunAddress.setText(vo.getJibunAddress());
				naverMap.resX.setText(vo.getX());
				naverMap.resY.setText(vo.getY());
				
				is.close();
				outputStream.close();
			} else {
				System.out.println(responseCode);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
