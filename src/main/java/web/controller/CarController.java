package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.Arrays;

@Controller
@Validated
public class CarController {
    private CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5", required = false) Integer count, Model model) {
        model.addAttribute("title", "Список автомобилей:");
        model.addAttribute("cars", carService.listOfCars(count));
        return "cars";
    }
}
