package web.service;

import web.dao.CarDAO;
import web.dao.CarDAOImp;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    private CarDAO carDAO = new CarDAOImp();

    public CarServiceImp() {
        addCar();
    }

    @Override
    public void addCar() {
        carDAO.addCar(new Car("BMW", "X5", 2020));
        carDAO.addCar(new Car("Audi", "A4", 2018));
        carDAO.addCar(new Car("Tesla", "Model S", 2021));
        carDAO.addCar(new Car("Chevrolet", "Impala", 1967));
        carDAO.addCar(new Car("Ford", "Mustang", 2015));
    }

    @Override
    public List<Car> listOfCars(int count) {
        if (count < carDAO.listOfCars().size()){
            return carDAO.listOfCars().subList(0, count);
        }
        return carDAO.listOfCars();
    }
}
