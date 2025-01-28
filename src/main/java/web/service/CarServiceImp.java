package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private static CarDAOImpl carDAOImpl = new CarDAOImpl();
    private static final List<Car> carList = new ArrayList<>(carDAOImpl.getCarIndex());

    @Autowired
    public CarServiceImp(CarDAOImpl carDAOImpl) {
        CarServiceImp.carDAOImpl = carDAOImpl;
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
