package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CARS_COUNT;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "AUDI", "Red"));
        cars.add(new Car(++CARS_COUNT, "BMW", "Black"));
        cars.add(new Car(++CARS_COUNT, "Mercedes-Benz", "Yellow"));
        cars.add(new Car(++CARS_COUNT, "Toyota", "White"));
        cars.add(new Car(++CARS_COUNT, "Honda", "Brown"));
    }

    public List<Car> index( ) {
        return cars;
    }

    public Car show (int id) {
        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }
 }
