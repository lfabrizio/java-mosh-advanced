package com.fabrizio;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
    this.points = points;
    }
    @Override
    public int compareTo(User other) {
        // this < 0 -> -1
        // == -> 0
        // if > o -> 1
        return points - other.points;
    }
    @Override
    public String toString() {
        return "Points=" + points;
    }
}

