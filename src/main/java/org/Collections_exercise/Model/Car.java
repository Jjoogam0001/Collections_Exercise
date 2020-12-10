package org.Collections_exercise.Model;

public class Car {
    private int id;
    private String Brand;
    private String Model;


    public Car(int id, String brand, String model) {
        this.id = id;
        Brand = brand;
        Model = model;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }
}
