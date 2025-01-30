package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private final CarDAO carDAO;

    @Autowired
    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCarListByCount(int count) {
        return carDAO.getAllCars().stream().limit(count).collect(Collectors.toList());
    }
}
