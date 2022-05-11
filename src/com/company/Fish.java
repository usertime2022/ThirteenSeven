package com.company;

public class Fish {
    String view;
    int weight;
    String colour;

    public Fish(String view, int weight, String colour) {
        this.view = view;
        this.weight = weight;
        this.colour = colour;
    }
    Fish(){
        System.out.println("Fish: ");
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
