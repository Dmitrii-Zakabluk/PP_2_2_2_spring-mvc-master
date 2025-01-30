package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private final List<Car> cars;

    public CarDAOImpl(List<Car> cars) {

        this.cars = cars;

        this.cars.add(new Car(1, "AUDI", "Red"));
        this.cars.add(new Car(2, "BMW", "Black"));
        this.cars.add(new Car(3, "Mercedes-Benz", "Yellow"));
        this.cars.add(new Car(4, "Toyota", "White"));
        this.cars.add(new Car(5, "Honda", "Brown"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
