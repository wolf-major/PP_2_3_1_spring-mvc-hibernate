package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImp implements CarDAO {
    private List<Car> cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        this.cars.add(car);
    }

    @Override
    public List<Car> listOfCars() {
        return this.cars;
    }
}
