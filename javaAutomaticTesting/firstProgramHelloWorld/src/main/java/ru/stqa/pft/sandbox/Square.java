package ru.stqa.pft.sandbox;

public class Square {
    public double length;

    public Square(double length) {
        this.length = length;
    }

    // No use of "static" because method is part of the class. We use "static" in function
    public double area () {
        return this.length * this.length;
    }
}
