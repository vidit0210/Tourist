package com.example.vidit.tourist;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(getString(R.string.f1n),getString(R.string.fa1),R.drawable.vpav));
        data.add(new Data(getString(R.string.f2n),getString(R.string.fa2),R.drawable.mpav));
        DataAdapter dataAdapter = new DataAdapter(this,data);

        ListView listView = (ListView) findViewById(R.id.lfood);
        listView.setAdapter(dataAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
