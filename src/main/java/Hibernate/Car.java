package Hibernate;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String number;
//    @Version
//    int version;

    public Car(String number) {
        this.number = number;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
