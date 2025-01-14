package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@Validated
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carServiceInt) {
        this.carService = carServiceInt;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5", required = false) Integer count, Model model) {
        model.addAttribute("title", "Список автомобилей:");
        model.addAttribute("cars", carService.listOfCars(count));
        return "cars";
    }
}
