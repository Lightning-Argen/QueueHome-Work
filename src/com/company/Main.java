package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, machinedata> car = new HashMap<>();
       car.put(new Car(1,"ar 777"),
               new machinedata(2022,"BMW X6","$109,600","Black"));
        car.put(new Car(2,"ge 006 n"),
                new machinedata(2008,"Mercedes-AMG ONE","$2,800,000","cosmic color dark "));

        for (Map.Entry a :
                car.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}