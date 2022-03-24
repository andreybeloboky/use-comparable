package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Dog> dog = new ArrayList<>();
        dog.add(new Dog("AYYA", 2, 13));
        dog.add(new Dog("Katya", 14, 8));
        dog.add(new Dog("Andrew", 1, 3));
        dog.add(new Dog("Sergey", 1, 1));
        dog.add(new Dog("Inna", 1, 2));
        for (Dog value : dog) {
            System.out.println(value);
        }
        System.out.println(" ");
        Collections.sort(dog);
        for (Dog value : dog) {
            System.out.println(value);
        }
    }
}
