package com.company;

import java.util.Scanner;

/*
        1. Расширить задачу про котов и тарелки с едой

        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)

        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true

        4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)

        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль

        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
*/
public class Main {

    public static void main(String[] args) {
        System.out.println("Нажмите 1 для задач '1-4', и 2 для задач с '5-6'");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice){
            case 1:
        Plate plateRed = new Plate(20);
        Plate plateBlue = new Plate(18);
        Cat cat1 = new Cat("Georg",10,false);
        Cat cat2 = new Cat("Dashka", 6,false);
        Cat cat3 = new Cat("Mike", 12,false);
        Cat cat4 = new Cat("Mila", 8,false);
        plateBlue.info();
        plateRed.info();
        System.out.print(cat1.name+" подошел к миске и там осталось: ");
        cat1.eat(plateRed);
        System.out.println(cat1.name+" поел?: "+cat1.satiety);
        System.out.print(cat2.name+" подошел к миске и там осталось: ");
        cat2.eat(plateRed);
        System.out.println(cat2.name+" поел?: "+cat1.satiety);
        System.out.print(cat3.name+" подошел к миске и там осталось: ");
        cat3.eat(plateBlue);
        System.out.println(cat3.name+" поел?: "+cat1.satiety);
        System.out.println(cat4.name+" подошел к миске и там осталось: ");
        cat4.eat(plateBlue);
        System.out.println(cat4.name+" поел?: "+cat1.satiety);
        break;
            case 2:
                Plate platePurpule = new Plate(20);
                Cat[] Cat = new Cat[4];
                Cat[0] = new Cat("Missis Marpl",12,false);
                Cat[1] = new Cat("Mark",4,false);
                Cat[2] = new Cat("Kesha",5,false);
                Cat[3] = new Cat("Leo",6,false);
                Cat[0].eat(platePurpule);
                System.out.print("");
                Cat[1].eat(platePurpule);
                Cat[2].eat(platePurpule);
                Cat[3].eat(platePurpule);
                System.out.println("Желате добавить еды? Yes/No");
                Scanner sc = new Scanner(System.in);
                String S = sc.next();
                switch(S){
                    case "Yes":
                    Plate.addFood();
                    System.out.println("Вы положили котикам еды!!!");
                    System.out.println("В тарелке стало "); platePurpule.info();
                    break;
                    case "No":
                    System.out.println("Вы оставили котика(ов) голодными...");
                    break;
                }
                break;
        }
    }
}
