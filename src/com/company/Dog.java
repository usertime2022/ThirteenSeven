package com.company;

public class Dog {
    String view;
    int weight;
    String colour;

    public Dog(String view, int weight, String colour) {
        this.view = view;
        this.weight = weight;
        this.colour = colour;
    }

    public Dog() {
        System.out.println("Dog: ");
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
