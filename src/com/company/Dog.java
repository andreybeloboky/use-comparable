package com.company;

public class Dog implements Comparable<Dog> {
    private String Name;
    private int age;
    private int weight;

    public Dog(String name, int age, int weight) {
        Name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
