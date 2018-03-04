package com.example.android.yodaquotes;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by shannonbeach on 3/3/18.
 */

public class ColorWheel {
    String[] colors = {
            "#E64A19",
            "#546E7A",
            "#5C6BC0",
            "#0288D1",
            "#009688",
            "#7E57C2",
            "#303F9F",
            "#1976D2",
            "#F44336",
            "#E91E63",
            "#9C27B0",
            "#AA00FF",
            "#1B5E20",
            "#E65100",
            "#795548",
            "#FF9E80",
            "#424242",
            "#009688",
    };

    int getColor(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;

    }
}
