package org.example.entities;

import java.util.HashSet;
public class Film {

    private String name;
    private Director director;
    private HashSet<Actor> cast;

    private float score;

    public Film(HashSet<Actor> cast, Director director, String name, float score) {
        this.cast = new HashSet<Actor>(cast);
        this.director = director;
        this.name = name;
        this.score = score;
    }

    public HashSet<Actor> getCast() {
        return cast;
    }

    public void setCast(HashSet<Actor> cast) {
        this.cast = cast;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = new Director(director);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
