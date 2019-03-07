package com.example.parshia.theeatingapp;

/**
 * Created by Parshia on 5/15/2017.
 */

public class Coffee {
    String name;
    String description;
    int imageId;

    public Coffee(String name,String description,int imageId)
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

    public static final Coffee[] coffees={
            new Coffee("Espresso","A coffee made with high pressure of water" + " towards fine coffee grains", R.drawable.espresso),
    new Coffee("Latte","A delicious beverage made with coffee and milk",R.drawable.latte),
            new Coffee("Irish Coffee","A beverage consisted of hot coffee" + " and topped cream", R.drawable.irish)
    };
}
