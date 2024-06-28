package service;

import objects.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsList(List<Car> car, String count);
}
