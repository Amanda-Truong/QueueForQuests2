package edu.wit.mobileapp.queueforquests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ScrollMenu extends AppCompatActivity {
    private final String TAG = "myApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_menu);

        //Populates the list with 50 items called "item_i"
        List<ListItem> list = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            ListItem item = new ListItem();

            //Set the name of the group
            String name = "item_" + i;
            item.groupName = name;

            //Set the date to today and add
            Date today = Calendar.getInstance().getTime();
            SimpleDateFormat formatter = new SimpleDateFormat(" MM/dd/yyyy, KK:mm a");
            String date = formatter.format(today);
            item.date = date;

            //Set the group bio
            String bio = "Here is a sample group bio for item " + i;
            item.groupBio = bio;

            //Add to list to display
            list.add(item);
        }

        ListItemAdapter adapter = new ListItemAdapter(this, 0, list);
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
