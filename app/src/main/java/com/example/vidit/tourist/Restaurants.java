package com.example.vidit.tourist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
       // getActionBar().setDisplayHomeAsUpEnabled(true);




        ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(getString(R.string.r1n),getString(R.string.ra1),R.drawable.taj));
        data.add(new Data(getString(R.string.r2n),getString(R.string.ra2),R.drawable.oberoi));


        DataAdapter dataAdapter = new DataAdapter(this,data);

        ListView listView = (ListView) findViewById(R.id.lres);
        listView.setAdapter(dataAdapter);
    }
}
