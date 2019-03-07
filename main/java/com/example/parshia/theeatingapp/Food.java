package com.example.parshia.theeatingapp;

/**
 * Created by Parshia on 5/20/2017.
 */

public class Food {
    String name;
    String description;
    int imageId;

    public Food(String name,String description,int imageId)
    {
        this.name=name;
        this.description=description;
        this.imageId=imageId;

    }

    public int getImageId()
    {
        return imageId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString()
    {
        return name;
    }

    public static final Food[] foods={
            new Food("Pizza","A yeasted flatbread typically topped with tomato sauce and cheese and baked in an oven. ", R.drawable.pizza),
            new Food("Lasagna","Wide, flat-shaped pasta, and possibly one of the oldest types of pasta.",R.drawable.lasagna),
            new Food("Beef Stroganoff","A Russian dish of sautéed pieces of beef served in a sauce with smetana", R.drawable.beefstroganoff)
    };
}
