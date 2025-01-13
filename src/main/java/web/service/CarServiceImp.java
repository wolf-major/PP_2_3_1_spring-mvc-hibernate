package web.service;

import web.dao.CarDAO;
import web.dao.CarDAOImp;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    private CarDAO carDAO = new CarDAOImp();

    public CarServiceImp() {
        addCar(new Car("BMW", "X5", 2020));
        addCar(new Car("Audi", "A4", 2018));
        addCar(new Car("Tesla", "Model S", 2021));
        addCar(new Car("Chevrolet", "Impala", 1967));
        addCar(new Car("Ford", "Mustang", 2015));
    }

    @Override
    public void addCar(Car car) {
        carDAO.addCar(car);
    }

    @Override
    public List<Car> listOfCars(int count) {
        if (count < carDAO.listOfCars().size()){
            return carDAO.listOfCars().subList(0, count);
        }
        return carDAO.listOfCars();
    }
}
