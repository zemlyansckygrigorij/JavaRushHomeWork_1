package com.javarush.test.level24.lesson14.big01;

/**
 * Created by ГРИГОРИЙ on 30.08.2016.
 * Задание 13
 Класс Ball уже посложнее - шарик же двигается.
 Нам понадобятся переменные
 а) speed (скорость шарика) типа double
 б) direction (направление движения в градусах: от 0 до 360) типа double
 в) dx (расстояние по x, которое проходит шарик за один шаг. вычисляется на основе speed и direction) типа double.
 г) dy (расстояние по y, которое проходит шарик за один шаг. вычисляется на основе speed и direction) типа double.
 д) isFrozen ("истина" если шарик "заморожен" - не двигается) типа boolean
 е) добавь геттеры для всех переменных этого класса

 А еще сделай-ка конструктор:
 а) в конструктор передаются x,y, speed, direction
 б) радиус (для родительского класса) всегда равен 1
 в) не забудь установить isFrozen в true - в начале игры шарик никуда не летит.


 */
public class Ball extends BaseObject
{
    private int width;
    private int height;
   // private int x;
 //   private int y;
    private double speed;
    private double direction ;
    private double dx  ;
    private double dy ;
    private boolean isFrozen;
    public Ball(double x, double y, double radius, int width, int height)
    {
        super(x, y, radius);
        this.width = width;
        this.height = height;
    }

    public Ball(double x, double y, double radius, int width, int height, int x1, int y1)
    {
        super(x, y, radius);
        this.width = width;
        this.height = height;
        this.x = x1;
        this.y = y1;
    }


    public Ball(double x, double y,double speed, double direction)
    {
        super(x, y, 1);
        this.direction = direction;

        this.speed = speed;
        this.isFrozen = true;

    }

    public void move(){}
    public void draw(Canvas canvas){}

    public int getWidth(){return width;}
    public int getHeight(){return height;}
  //  public double getX(){return x;}
   // public double getY(){return y;}
    public double getSpeed(){return speed;}
    public double getDirection(){return direction ;}
    public double getDx(){return dx;}
    public double getDy(){return dy;}
    public boolean getIsFrozen(){return isFrozen;}
}
