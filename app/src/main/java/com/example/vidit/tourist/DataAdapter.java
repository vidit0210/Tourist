package com.example.vidit.tourist;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vidit on 10/09/16.
 */
public class DataAdapter extends ArrayAdapter<Data> {

    public DataAdapter(FragmentActivity context, ArrayList<Data> data)
    {
        super(context,0,data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Data cdata= getItem(position);

        ImageView img= (ImageView) listItemView.findViewById(R.id.list_item_icon);
        img.setImageResource(cdata.getmImageId());

        TextView  name= (TextView) listItemView.findViewById(R.id.name);
        name.setText(cdata.getmName());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(cdata.getmAddress());

        return listItemView;
    }

}
