package com.example.parshia.theeatingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
public static int position;
    public void setPosition(int position){ this.position=position;}
    public int getPosition()
    {
        return position;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener listener=new AdapterView.OnItemClickListener() {
            @Override



            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if (position == 0) {
                    //Coffee
                    setPosition(position);
                    getPosition();
                    Intent intent=new Intent(MainActivity.this,CategoryActivity.class);

                            startActivity(intent);


                } else if (position == 1) {
                    //Food
                    setPosition(position);
                    getPosition();
                    Intent intent=new Intent(MainActivity.this,CategoryActivity.class);

                    startActivity(intent);
                } else if (position == 2) {
                    //Dessert
                    setPosition(position);
                    getPosition();
                    Intent intent=new Intent(MainActivity.this,CategoryActivity.class);

                    startActivity(intent);
                   // Log.e("EatingApp","Dessert");
                }
            }
        };
        ListView listView=(ListView) findViewById(R.id.mainListView);
        listView.setOnItemClickListener(listener);
        }
    }

