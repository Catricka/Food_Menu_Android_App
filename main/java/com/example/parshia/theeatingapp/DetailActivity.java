package com.example.parshia.theeatingapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
public static final String INDEX= "index";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent=getIntent();
        int id= intent.getExtras().getInt(INDEX);
        //or      int id= (Integer) intent.getExtras().get(INDEX);

        Coffee coffee=Coffee.coffees[id];
        Food food=Food.foods[id];
        Dessert dessert=Dessert.desserts[id];
        ImageView iv=(ImageView) findViewById(R.id.imageView);
        TextView nameTV=(TextView) findViewById(R.id.nameTV) ;
        TextView descTV=(TextView) findViewById(R.id.descTV) ;

        iv.setImageResource(coffee.getImageId());
        iv.setContentDescription(coffee.getDescription());
        nameTV.setText(coffee.getName());
        descTV.setText(coffee.getDescription());
        iv.setImageResource(food.getImageId());
        iv.setContentDescription(food.getDescription());
        nameTV.setText(food.getName());
        descTV.setText(food.getDescription());
        iv.setImageResource(dessert.getImageId());
        iv.setContentDescription(dessert.getDescription());
        nameTV.setText(dessert.getName());
        descTV.setText(dessert.getDescription());

    }
}
