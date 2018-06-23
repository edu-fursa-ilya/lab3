package com.lab3;

//класс наследник об базового класса имеющий
// свойсва базового класса и расширяющий их
public class HybridEngine extends Engine implements Moveable {

    public HybridEngine(double volume, double power) {
        super(volume, power);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект класса "+ this.getClass().getSimpleName() + " уничтожен методом finalize()");
        super.finalize();
    }

    public double getVolume() {
        return volume;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "HybridEngine{" +
                "volume=" + volume +
                ", power=" + power +
                '}';
    }

    @Override
    public void foo() {
        System.out.println("foo() метод вызван в классе " + this.getClass().getSimpleName());
    }
}
