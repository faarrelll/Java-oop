package com.enigma.oop_fundamental.Inheritance;

public class InheritanceApp {
    public static void main(String[] args) {
        Cat cat = new Cat("michi");
        Bird bird = new Bird("pororo");

        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Anggora");
        cats[1] = new Cat("Oyen");
        cats[2] = new Cat("Sumbul");

        for (Cat value: cats){
            value.sleep();
        }

        System.out.println(cat.name);
        cat.eat();
        cat.moving();
        cat.sleep();

        System.out.println(bird.name);
        bird.eat();
        bird.moving();
        bird.sleep();

        Rectangle rectangle = new Rectangle(6.0,4.0);
        Cube cube = new Cube(7.0, 5.0, 3.0);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircumference());

        System.out.println(cube.getVolume());
        System.out.println(cube.getArea());


    }
}
