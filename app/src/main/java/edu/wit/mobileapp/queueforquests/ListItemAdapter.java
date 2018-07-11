package edu.wit.mobileapp.queueforquests;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListItemAdapter extends ArrayAdapter<ListItem>{
    private LayoutInflater mInflater;

    public ListItemAdapter (Context context, int rid, List<ListItem> list) {
        super(context, rid, list);
        mInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Makes the search view from a scrollable list
        ListItem item = (ListItem)getItem(position);

        View view = mInflater.inflate(R.layout.list_item, null);

        TextView name;
        name = (TextView)view.findViewById(R.id.groupName);
        name.setText(item.groupName);

        TextView date;
        date = (TextView)view.findViewById(R.id.date);
        date.setText(item.date);

        TextView info;
        info = (TextView) view.findViewById(R.id.groupBio);
        info.setText(item.groupBio);

        return view;
    }
}
