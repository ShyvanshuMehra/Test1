package otp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class SendOTP
{
	
    public static void sendOTP(String message, String number, String apikey)
    {
    	try
    	{
    	String sendId = "FSTSMS";
    	String language = "english";
    	String route = "p";
    	
    	message = URLEncoder.encode(message, "UTF-8");
    	
    	String myUrl="https://www.fast2sms.com/dev/bulkV2?authorization="+apikey+"&sender_id="+sendId+"&message="+message+"&language="+language+"&route="+route+"&numbers="+number;
    	URL url = new URL(myUrl);
    	HttpURLConnection con = (HttpURLConnection)url.openConnection();
    	
    	con.setRequestMethod("GET");
    	
    	con.setRequestProperty("User-Agent", "Mozilla/5.0");
    	
    	con.setRequestProperty("cache-control", "no-cache");
    	
    	int responseCode = con.getResponseCode();
    	System.out.println("Response Code : "+responseCode);
    	
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String[] args)
	{
		

	}

}
