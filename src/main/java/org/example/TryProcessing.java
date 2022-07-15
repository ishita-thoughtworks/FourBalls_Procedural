package org.example;

import processing.core.PApplet;


public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int x = 0;
    int y = 0;
    int z = 0;
    int a = 0;


    public static void main(String[] args) {
        PApplet.main("org.example.TryProcessing", args);
    }

    @Override
    public void draw() {
        ellipse(x,HEIGHT / 5, DIAMETER,DIAMETER);
        x++;
        ellipse(y,(2 * HEIGHT ) / 5, DIAMETER,DIAMETER);
        y += 2;
        ellipse(z,(3 * HEIGHT ) / 5, DIAMETER,DIAMETER);
        z += 3;
        ellipse(a,(4 * HEIGHT ) / 5 , DIAMETER,DIAMETER);
        a += 4;
    }

    private void paintWhite() {
        background(255);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

}
