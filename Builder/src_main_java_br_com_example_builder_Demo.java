package br.com.example.builder;

import br.com.example.builder.builders.CarBuilder;
import br.com.example.builder.builders.CarManualBuilder;
import br.com.example.builder.cars.Car;
import br.com.example.builder.cars.Manual;
import br.com.example.builder.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
