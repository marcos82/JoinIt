package com.example.joinit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Get the message from the intent
        Intent intent = getIntent();
        String message = ""; //intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        
        // Create the text view
        TextView textView = new TextView(this);
        textView.setWidth(40);
        textView.setText(message);
        
        setContentView(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_display_message, menu);
        return true;
    }
}
