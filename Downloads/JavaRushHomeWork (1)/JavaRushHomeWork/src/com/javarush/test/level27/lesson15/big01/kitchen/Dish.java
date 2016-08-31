package com.javarush.test.level27.lesson15.big01.kitchen;

/**
 * Created by ГРИГОРИЙ on 31.08.2016.
 */
public enum Dish
{
    Fish, Steak, Soup, Juice, Water;
    public static String allDishesToString() {
        StringBuilder sb = new StringBuilder(Arrays.toString(values()));
        sb.delete(sb.length() - 1, sb.length());
        sb.delete(0, 1);
        return sb.toString();
    }
}
