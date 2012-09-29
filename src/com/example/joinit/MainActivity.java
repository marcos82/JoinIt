package com.example.joinit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    // When user click the buttons
	public void onClick(View v) {
		
		Intent intent = null;
		
		switch(v.getId()) {
		
			case R.id.login_button :
				intent = new Intent(this, DisplayLoginActivity.class);
				startActivity(intent);
				break;
		
			case R.id.login_sign_up:
				intent = new Intent(this, DisplaySignUpActivity.class);
				startActivity(intent);
				break;
		
		}
	}
    
    
}
