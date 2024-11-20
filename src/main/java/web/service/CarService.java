package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Car> cars = Arrays.asList(
            new Car("Red", "Tesla", 2020),
            new Car("Blue", "Ford", 2018),
            new Car("White", "Honda", 2019),
            new Car("Black", "Toyota", 2021),
            new Car("Silver", "Audi", 2017)
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
