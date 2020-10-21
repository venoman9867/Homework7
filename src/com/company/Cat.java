package com.company;

public class Cat extends Animal{
    public String name;
    private int appetite;
    public static boolean satiety;
    public Cat(String name, int appetite, Boolean satiety){
        this.name=name;
        this.appetite=appetite;
        this.satiety=satiety;
    }
    public void eat(Plate plate){
        plate.decreaseFood(appetite);
    }
}
