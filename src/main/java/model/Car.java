package model;

public class Car {
    int id;
    String brand;
    String color;


    public Car(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;

    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
