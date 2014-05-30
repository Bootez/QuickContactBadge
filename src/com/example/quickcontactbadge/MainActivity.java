package com.example.quickcontactbadge;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.QuickContactBadge;

public class MainActivity extends Activity {
    
    QuickContactBadge badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        badge = (QuickContactBadge) findViewById(R.id.badge);
        badge.assignContactFromPhone("021-88888888", false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
