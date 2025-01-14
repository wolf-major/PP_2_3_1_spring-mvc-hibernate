package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {
    private List<Car> cars = new ArrayList<>();

    public CarDAOImp(){
        addCar(new Car("BMW", "X5", 2020));
        addCar(new Car("Audi", "A4", 2018));
        addCar(new Car("Tesla", "Model S", 2021));
        addCar(new Car("Chevrolet", "Impala", 1967));
        addCar(new Car("Ford", "Mustang", 2015));
    }

    @Override
    public void addCar(Car car) {
        this.cars.add(car);
    }

    @Override
    public List<Car> listOfCars() {
        return this.cars;
    }
}
