package com.syntax.GroupProject2;

public abstract class Vehicle {
    /*
    Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
    which should be returning a price of the Vehicle.
     */

    double vehiclePrice;

    abstract double calculateSalePrice(double vehiclePrice);

}

class Truck extends Vehicle {
    int weight = 1500;
    @Override
    double calculateSalePrice(double vehiclePrice) {
        double cost;
        if(weight>2000){
            cost=vehiclePrice*0.9;
        }
        else{
            cost=vehiclePrice*0.8;
        }
        return cost;
    }
}

class Sedan extends Vehicle {
    int length = 27;

    @Override
    double calculateSalePrice(double vehiclePrice) {
        double cost;
        if (length > 20) {
            cost = vehiclePrice * 0.95;
        } else {
            cost = vehiclePrice * 0.9;
        }
        return cost;
    }

    public static void main(String[] args) {
        Vehicle[] car = {new Truck(),new Sedan()};
        for (Vehicle vehicle : car) {
            System.out.println(vehicle.calculateSalePrice(40000));
        }
    }
}

