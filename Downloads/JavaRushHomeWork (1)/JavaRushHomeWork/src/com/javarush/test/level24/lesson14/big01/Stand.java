package com.javarush.test.level24.lesson14.big01;

/**
 * Created by ГРИГОРИЙ on 30.08.2016.
 */
public class Stand extends BaseObject
{
    private int width;
    private int height;
    private int x;
    private int y;

    public Stand(double x, double y, double radius, int width, int height)
    {
        super(x, y, radius);
        this.width = width;
        this.height = height;

    }

    public Stand(double x, double y, double radius, int width, int height, int x1, int y1)
    {
        super(x, y, radius);
        this.width = width;
        this.height = height;
        this.x = x1;
        this.y = y1;
    }


    public void move(){}
    public void draw(Canvas canvas){}
}
