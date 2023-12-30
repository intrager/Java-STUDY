import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Project01_D {
	public static void main(String[] args) {
		String apiURL = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
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
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}