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

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Project01_E {
	
	public static final String STATIC_MAP_URL = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
	public static final String apiURL = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
	public static final String clientId = "t3owlgd2hw";                                  
	public static final String clientSecret = "lrxfxbekfHZIJdLTJ566GQV0eXZm9kPhzZnrtCuO";
	
	public static void createMapImage(String point_x, String point_y, String address) {
		try {
			String pos = URLEncoder.encode(point_x + " " + point_y, "UTF-8");
			String url = STATIC_MAP_URL;
			url += "center=" + point_x + "," + point_y;
			url += "&level=16&w=700&h=500";
			url += "&markers=type:t|size:mid|pos:" + pos + "|label:" + URLEncoder.encode(address, "UTF-8");
			
			URL connUrl = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) connUrl.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
			conn.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);
			
			int responseCode = conn.getResponseCode();
			BufferedReader br;
			if(responseCode == 200) {
				InputStream is = conn.getInputStream();
				int read = 0;
				byte[] bytes = new byte[1024];
				
				// 랜덤한 이름으로 파일 생성
				String fileName = Long.valueOf(new Date().getTime()).toString();
				File jpgName = new File(fileName + ".jpg");
				jpgName.createNewFile();
				
				OutputStream outputStream = new FileOutputStream(jpgName);
				
				while ((read = is.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}
				is.close();
				outputStream.close();
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}
				br.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		String clientId = "t3owlgd2hw";                                  
		String clientSecret = "lrxfxbekfHZIJdLTJ566GQV0eXZm9kPhzZnrtCuO";
		
		BufferedReader ioBr = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("주소를 입력하세요.");
			String address = ioBr.readLine();
			String addr = URLEncoder.encode(address, "UTF-8");
			String reqUrl = apiURL + addr;
			
			URL url = new URL(reqUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
			conn.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);
			
			BufferedReader br;
			int responseCode = conn.getResponseCode();
			if(responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			String line = br.readLine();
			StringBuffer response = new StringBuffer();
			
			String x = "";
			String y = "";
			String roadAddr = "";
			
			while(line != null) {
				response.append(line);
				line = br.readLine();
			}
			br.close();
			
			JSONTokener tokener = new JSONTokener(response.toString());
			JSONObject object = new JSONObject(tokener);
			System.out.println(object.toString(2)); // 2만큼 들여쓰기
			
			JSONArray arr = object.getJSONArray("addresses");
			
			for(int i = 0; i < arr.length(); i++) {
				JSONObject obj = (JSONObject) arr.get(i);
				System.out.println("도로명 : " + obj.get("roadAddress"));
				System.out.println("지번 : " + obj.get("jibunAddress"));
				System.out.println("경도 : " + obj.get("x"));
				System.out.println("위도 : " + obj.get("y"));
				
				x = (String) obj.get("x");
				y = (String) obj.get("y");
				roadAddr = (String) obj.get("roadAddress");
			}
			createMapImage(x, y, roadAddr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}