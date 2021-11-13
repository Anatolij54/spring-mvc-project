package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.service.CarService;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCountCar(@RequestParam(value = "count", required = false) Integer count, Model model) {

        CarService service = new CarService();

        if (count == null) {
            List<String> listCars = service.getListCarValue();
            model.addAttribute("listCars", listCars);
            return "cars";
        } else {
            List<String> listCars = service.getListCarValue(count);
            model.addAttribute("listCars", listCars);
            return "cars";
        }
    }
}
