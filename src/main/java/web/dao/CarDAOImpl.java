package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private List<Car> cars;

    public CarDAOImpl(List<Car> cars) {
        this.cars = cars;
    }

    public CarDAOImpl() {

    }

    @Override
    public List<Car> getCarIndex() {
        cars = new ArrayList<>();

        cars.add(new Car(1, "AUDI", "Red"));
        cars.add(new Car(2, "BMW", "Black"));
        cars.add(new Car(3, "Mercedes-Benz", "Yellow"));
        cars.add(new Car(4, "Toyota", "White"));
        cars.add(new Car(5, "Honda", "Brown"));
        return cars;
    }
}
