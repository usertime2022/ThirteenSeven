package com.company;

public class Main {

    public static void main(String[] args) {
	Fish slope = new Fish("slope",5,"white");
    new Fish();
    System.out.println("view: "+slope.getView()+", weight: "+slope.getWeight()+" kg, colour: "+slope.getColour());

    Cat sphinx = new Cat("sphinx",3,"grey");
    new Cat();
    System.out.println("view: "+sphinx.getView()+", weight: "+sphinx.getWeight()+" kg, colour: "+sphinx.getColour());

    Dog bulldog = new Dog("bulldog", 25,"peebold");
    new Dog();
        System.out.println("view: "+bulldog.getView()+", weight: "+bulldog.getWeight()+" kg, colour: "+bulldog.getColour());
    }
}
