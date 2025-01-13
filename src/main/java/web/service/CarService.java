package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void addCar();
    List<Car> listOfCars(int count);
}
