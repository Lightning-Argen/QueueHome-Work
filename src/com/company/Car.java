package com.company;

public class Car {

    private int id;
    private String numberCar;

    public Car(int id, String numberCar) {
        this.id = id;
        this.numberCar = numberCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberCar='" + numberCar + '\'' +
                '}';
    }
}
