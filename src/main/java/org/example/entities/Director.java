package org.example.entities;

public class Director {

    private String name;

    public Director(String name) {
        this.name = name;
    }

    public Director(Director director){
        this.name = director.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
