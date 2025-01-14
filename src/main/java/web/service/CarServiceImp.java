package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDAO carDAO;

    @Autowired
    public CarServiceImp(CarDAO carDAOInt) {
        this.carDAO = carDAOInt;
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
