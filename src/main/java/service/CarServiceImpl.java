package service;

import objects.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarsList(List<Car> cars, String count) {
        if (count == null) {
            return cars;
        } else {
            return cars.stream().limit(Integer.parseInt(count)).toList();
        }
    }
}

