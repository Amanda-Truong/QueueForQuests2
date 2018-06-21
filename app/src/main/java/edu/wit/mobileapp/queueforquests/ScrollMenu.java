package edu.wit.mobileapp.queueforquests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ScrollMenu extends AppCompatActivity {
    private final String TAG = "myApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        //Populates the list with 50 items called "item_i"
        for (int i = 0; i < 50; i++) {
            adapter.add("item_" + i);
        }

        ListView listView = (ListView)findViewById(R.id.scrollView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v(TAG, "item " + position + " is clicked");
            }
        });
    }
}
