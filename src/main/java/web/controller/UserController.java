package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import web.service.CarService;

@Controller
@Validated
public class UserController {
    private final CarService carService;

    @Autowired
    public UserController(CarService carServiceInt) {
        this.carService = carServiceInt;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView userList() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userList");
        return mav;
    }
}
