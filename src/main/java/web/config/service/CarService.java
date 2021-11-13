package web.config.service;

import org.springframework.stereotype.Component;
import web.controller.HelloController;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    public List<Car> getListCar() {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VOLVO", "RED", 1200));
        cars.add(new Car("TOYOTA", "BLUE", 5000));
        cars.add(new Car("LEXUS", "ORANGE", 2000));
        cars.add(new Car("MERCEDES", "WHITE", 1800));
        cars.add(new Car("CHERRY", "GREY", 800));
        return cars;
    }

    public List<String> getListCarValue(int value) {

        List<String> listNew = new ArrayList<>();
        List<Car> cars = getListCar();

        if (value >= cars.size()) {
            for (Car car : cars) {
                listNew.add(car.toString());
            }
            return listNew;
        } else if (value < cars.size() && value > 0) {
            for (int i = 0; i < value; i++) {
                listNew.add(cars.get(i).toString());
            }
            return listNew;
        } else {
            return new ArrayList<>();
        }
    }


    public List<String> getListCarValue() {

        List<Car> cars = getListCar();
        List<String> listNew = new ArrayList<>();

        for (Car car : cars) {
            listNew.add(car.toString());
        }
        return listNew;
    }


}
