package Hibernate.enums;

import Hibernate.Car;

import javax.persistence.Entity;

//@Entity
public class Opel extends Car {
    private int price;

    public Opel(String number, int price) {
        super(number);
        this.price = price;
    }
}
