package ru.stqa.pft.sandbox;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyFirstProgrammHelloWorld {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        printSmth("Hello and welcome!");

        Square someSquare = new Square(5.0);
        printSmth("Площадь квадрата: " + area(someSquare));
    }

    public static void printSmth(String smth) {
        System.out.println(smth);
    }

    public static double area (Square s) {
        return s.length * s.length;
    }
}