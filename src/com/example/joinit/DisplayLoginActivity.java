package com.example.joinit;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DisplayLoginActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_display_login, menu);
        return true;
    }
}
