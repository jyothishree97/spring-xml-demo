package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie {


    Actor actor;
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

}
