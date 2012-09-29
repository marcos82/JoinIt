package com.example.joinit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class DisplaySignUpActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sign_up);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_display_sign_up, menu);
        return true;
    }
    
    // When the user click on the register button
    public void onClickRegister(View view) {
    	HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(getString(R.string.server)); 
        
        try {
			
        	// Create the arraylist with all post variables
        	List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
        	nameValuePairs.add(new BasicNameValuePair("r", "login/registration"));
        	
        	// Add the arraylist to the httppost
        	httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        	
        	HttpResponse response = httpclient.execute(httppost);        	
        	
			if(response != null) {
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
				StringBuilder builder = new StringBuilder();
				for (String line = null; (line = reader.readLine()) != null;) {
					Log.i("INFO", line);
				    //builder.append(line).append("\n");
				}
				
			}
			
		} 
        
        catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
