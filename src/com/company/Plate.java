package com.company;

public class Plate extends Animal{
    private static int food;
    int i=1;
    public Plate(int food){
        this.food=food;
    }
    public void decreaseFood(int appetite){
        if(food-appetite>=0) {
            this.food -= appetite;
            System.out.println("Котик "+i+" поел и в тарелке осталось "+food);
            Cat.satiety=true;
            i++;
        }else{ System.out.println("Котику "+i+" еды не хватило, и в тарелке сейчас: "+food);
        Cat.satiety=false;
        i++;
        }
    }
    public void info(){
        System.out.println("plate: "+food);
    }
    public static void addFood(){
        food+=50;
    };
}
