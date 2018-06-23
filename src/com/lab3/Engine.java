package com.lab3;

//базовый класс
public abstract class Engine {
    protected double volume; // объем двигателя
    protected double power; //мощность двигателя

    public Engine(double volume, double power) {
        this.volume = volume;
        this.power = power;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void printInfo() {
        System.out.println("Engine " + this.getClass().getSimpleName() + " has volume: " + volume + " and power: " + power);
    }

}
