package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    void addCar(Car car);
    List<Car> listOfCars();
}
