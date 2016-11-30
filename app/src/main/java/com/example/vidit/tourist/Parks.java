package com.example.vidit.tourist;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);
       // getActionBar().setDisplayHomeAsUpEnabled(true);




        ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(getString(R.string.p1n),getString(R.string.pa1),R.drawable.pdp));
        data.add(new Data(getString(R.string.p2n),getString(R.string.pa2),R.drawable.hg));

        DataAdapter dataAdapter = new DataAdapter(this,data);

        ListView listView = (ListView) findViewById(R.id.lpark);
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
