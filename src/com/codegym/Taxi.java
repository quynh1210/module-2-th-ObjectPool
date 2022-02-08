package com.codegym;

public class Taxi {
    private String name;

    public Taxi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + "\'" +
                '}';
    }
}
