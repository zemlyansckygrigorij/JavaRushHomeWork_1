package com.javarush.test.level24.lesson14.big01;

/**
 * Created by ГРИГОРИЙ on 30.08.2016.
 * Задание 16
 И наконец "подставка"!
 Ей понадобятся такие переменные
 а) speed (скорость шарика) типа double
 б) direction (направление движения по оси x: 1 - вправо, -1 - влево) типа double
 в) создай для них геттеры


 А еще с тебя конструктор, примерно вот такой:
 public Stand(double x, double y)
 {
 super(x,y,3);
 speed = 1;
 direction = 0;
 }
 */
public class Stand extends BaseObject
{
    private int width;
    private int height;
    private int x;
    private int y;
    //скорость
    private double speed;
    //направление  (в градусах от 0 до 360)
    private double direction;

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
    public Stand(double x, double y)
    {
        super(x,y,3);
        speed = 1;
        direction = 0;
    }

    public void move(){}

    public void draw(Canvas canvas){}

    public double getDirection()
    {
        return direction;
    }

    public double getSpeed()
    {
        return speed;
    }
}
