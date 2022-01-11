package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {

        Jaeger robotOne = new Jaeger();
        robotOne.setModelName("Cherno Alpha");
        robotOne.setMark("Mark-1");
        robotOne.setOrigin("Russia");
        robotOne.setHeight(280);
        robotOne.setWeight(2412);
        robotOne.setStrength(10);
        robotOne.setArmor(10);

        System.out.println("Jaeger's model name is " + robotOne.getModelName());
        System.out.println("Jaeger's mark is " + robotOne.getMark());
        System.out.println("Jaeger's origin is " + robotOne.getOrigin());
        System.out.println("Jaeger's height is " + robotOne.getHeight());
        System.out.println("Jaeger's weight is " + robotOne.getWeight());
        System.out.println("Jaeger's strength is " + robotOne.getStrength());
        System.out.println("Jaeger's armor is " + robotOne.getArmor());

        if (robotOne.drift()) {
            robotOne.move();
        }
        
        Jaeger robotTwo = new Jaeger("Gipsy Danger", "Mark-3", "USA", 260, 1980, 8, 6);

        System.out.println();
        System.out.println(robotTwo);

        if (!robotTwo.drift()) {
            robotTwo.move();
        } else System.out.println(robotTwo.getModelName() + ": not entered drift.");
    }
}
