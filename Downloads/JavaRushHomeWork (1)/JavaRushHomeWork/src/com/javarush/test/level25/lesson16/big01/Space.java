package com.javarush.test.level25.lesson16.big01;

/**
 * Created by ГРИГОРИЙ on 29.08.2016.
 */
import java.util.ArrayList;
public class Space
{
   private int width;
    private int height;
    private SpaceShip ship;
    private  ArrayList<Ufo> ufos = new ArrayList<Ufo>();
    private  ArrayList<Rocket> rockets = new ArrayList<Rocket>();
    private ArrayList<Bomb> bombs =new ArrayList<Bomb>();
    /*Для чего нам нужен класс Space?
Чего не хватает классу Space?
Правильно - методов run() и draw().
run управляет всей логикой игры, если ты помнишь.
А draw отвечает за отрисовку очередного "кадра".

А еще нам пригодится метод sleep(int ms)
Создай их.
*/
    public static void main(String[] args){}
    public void move(){}
    public void draw(){}
    public void run(){}

    public void sleep(int ms){}
    public SpaceShip getShip(){
        return ship;
    }
    public void setShip(SpaceShip ship){
        this.ship = ship;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public ArrayList<Ufo> getUfos(){
        return ufos;
    }
    public ArrayList<Rocket> getRockets(){
        return rockets;
    }
    public ArrayList<Bomb> getBombs(){
        return bombs;
    }
    public Space(int width,int height ){
        this.width =width;
        this.height =height ;
    }
}
