package com.stackroute.domain;

public class Movie {
    Actor actor;

    public Movie(Actor actor)
    {
        this.actor = actor;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
