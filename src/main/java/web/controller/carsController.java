package web.controller;

import objects.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class carsController {

    private static final List<Car> cars = new ArrayList<>(5);

    static {
        cars.add(new Car("mercedes", 600, 1));
        cars.add(new Car("BMW", 320, 2));
        cars.add(new Car("mazda", 626, 3));
        cars.add(new Car("pegeot", 407, 4));
        cars.add(new Car("porshe", 911, 5));
    }

    @GetMapping(value = "/cars")
    public String helloCars(ModelMap model1, HttpServletRequest req) {
        CarServiceImpl carService = new CarServiceImpl();
        String count = req.getParameter("count");
        model1.addAttribute("cars", carService.getCarsList(cars, count));
        return "cars";
    }
}
