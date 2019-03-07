package com.example.parshia.theeatingapp;

import android.app.ListActivity;
import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class CategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivity mainActivity = new MainActivity();
        ListView lv = getListView();


        if (mainActivity.getPosition() == 0) {
            ArrayAdapter<Coffee> listAdapter = new ArrayAdapter<Coffee>(
                    this, android.R.layout.simple_list_item_1, Coffee.coffees
            );
            lv.setAdapter(listAdapter);
        }
        if (mainActivity.getPosition() == 1) {
            ArrayAdapter<Food> listAdapter2 = new ArrayAdapter<Food>(
                    this, android.R.layout.simple_list_item_1, Food.foods
            );
            lv.setAdapter(listAdapter2);
        }
        if (mainActivity.getPosition() == 2) {
            ArrayAdapter<Dessert> listAdapter3 = new ArrayAdapter<Dessert>(
                    this, android.R.layout.simple_list_item_1, Dessert.desserts
            );

            lv.setAdapter(listAdapter3);
        }

    }



    //ctrl + O to implement
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        Intent intent= new Intent(this,DetailActivity.class);
        intent.putExtra(DetailActivity.INDEX,(int)id);
        startActivity(intent) ;
    }
}
