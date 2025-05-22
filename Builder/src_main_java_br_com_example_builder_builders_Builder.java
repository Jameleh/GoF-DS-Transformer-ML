package br.com.example.builder.builders;

import br.com.example.builder.cars.CarType;
import br.com.example.builder.components.Engine;
import br.com.example.builder.components.GPSNavigator;
import br.com.example.builder.components.Transmission;
import br.com.example.builder.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
