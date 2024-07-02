package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

import static service.CarServiceImpl.cars;


@Controller
public class CarsController {


    @GetMapping(value = "/cars")
    public String helloCars(ModelMap model1, HttpServletRequest req) {
        CarServiceImpl carService = new CarServiceImpl();
        String count = req.getParameter("count");
        model1.addAttribute("cars", carService.getCarsList(cars, count));
        return "cars";
    }
}
