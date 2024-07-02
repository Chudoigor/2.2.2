package service;

import objects.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    public static final List<Car> cars = new ArrayList<>(5);

    static {
        cars.add(new Car("mercedes", 600, 1));
        cars.add(new Car("BMW", 320, 2));
        cars.add(new Car("mazda", 626, 3));
        cars.add(new Car("pegeot", 407, 4));
        cars.add(new Car("porshe", 911, 5));
    }


    @Override
    public List<Car> getCarsList(List<Car> cars, String count) {
        if (count == null) {
            return cars;
        } else {
            return cars.stream().limit(Integer.parseInt(count)).toList();
        }
    }
}

