package com.example.vidit.tourist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView fp= (TextView) findViewById(R.id.fp);

        TextView res=(TextView) findViewById(R.id.res);

        TextView parks=(TextView) findViewById(R.id.parks);

        TextView food= (TextView) findViewById(R.id.food);


        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),FamousPlaces.class);
                startActivity(i);

            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Restaurants.class);
                startActivity(i);

            }
        });

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Parks.class);
                startActivity(i);

            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Food.class);
                startActivity(i);

            }
        });




    }
}
