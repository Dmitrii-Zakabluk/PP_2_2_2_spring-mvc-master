package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    private List<Car> cars;

    public CarDAO() {
        this.cars = cars;
    }

    public List<Car> carIndex() {
        cars = new ArrayList<>();

        cars.add(new Car(1, "AUDI", "Red"));
        cars.add(new Car(2, "BMW", "Black"));
        cars.add(new Car(3, "Mercedes-Benz", "Yellow"));
        cars.add(new Car(4, "Toyota", "White"));
        cars.add(new Car(5, "Honda", "Brown"));
        return cars;
    }
}
