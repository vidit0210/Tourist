package com.example.vidit.tourist;

import android.app.Fragment;
import android.provider.ContactsContract;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FamousPlaces extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //getActionBar().setDisplayHomeAsUpEnabled(true);

       setContentView(R.layout.activity_famous_places);
        ArrayList<Data> data = new  ArrayList<Data>();
       String s;

       data.add(new Data(getString(R.string.fp1n),getString(R.string.fp1a),R.drawable.gateway));
       data.add(new Data(getString(R.string.fp2n),getString(R.string.fp2a),R.drawable.cst));

        DataAdapter dataAdapter = new DataAdapter(this,data);

        ListView listView = (ListView) findViewById(R.id.lfp);
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
