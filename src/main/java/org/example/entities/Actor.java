package org.example.entities;

public class Actor {

    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public Actor(Actor actor){
        this.name = actor.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
