package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp{
    private static final CarDAO cars = new CarDAO();
    private static final List<Car> carList = new ArrayList<>(cars.carIndex());

    public List<Car> getCarList(int count) {
        if (count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
