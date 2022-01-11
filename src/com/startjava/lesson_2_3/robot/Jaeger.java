package com.startjava.lesson_2_3.robot;

public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public Jaeger() {} // конструктор без аргументов для выполнения первой части задания

    public Jaeger(String modelName,
                    String mark,
                    String origin,
                    float height,
                    float weight,
                    int strength,
                    int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println(getModelName() + ": moving");
    }

    @Override
    public String toString() {
        return String.format("Jaeger's model name is %s %nJaeger's mark is  %s %nJaeger's origin is  %s %nJaeger's height is  %.1f %n" +
                "Jaeger's weight is  %.1f %nJaeger's strength is  %d %nJaeger's armor is  %d",
                modelName, mark, origin, height, weight, strength, armor);
    }
}
