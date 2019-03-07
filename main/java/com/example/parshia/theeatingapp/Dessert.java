package com.example.parshia.theeatingapp;

/**
 * Created by Parshia on 5/20/2017.
 */

public class Dessert {
    String name;
    String description;
    int imageId;

    public Dessert(String name,String description,int imageId)
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

    public static final Dessert[] desserts={
            new Dessert("Tiramisu","Mascarpone custard layered with whipped cream and rum and coffee soaked ladyfingers.", R.drawable.tiramisu),
            new Dessert("Trifle","A cold dessert of sponge cake and fruit covered with layers of custard, jelly, and cream.",R.drawable.trifle),
            new Dessert("Panna Cotta","A traditional, easy, and delicious Italian custard.", R.drawable.pannacotta)
    };
}
