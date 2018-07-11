package edu.wit.mobileapp.queueforquests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    //eat dickss android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lookForGroupButt = (Button)findViewById(R.id.lookForGroup_Button);

        lookForGroupButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Switches view from Activity 2 to Activity 1
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ScrollMenu.class);
                startActivity(intent);
                Log.v("myApp", "Look for group button pressed");
            }
        });
    }
}
