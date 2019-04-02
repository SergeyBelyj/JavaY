package Hibernate.enums;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ElementCollection
    private List<HomeAdress> homeAdress;
    @ElementCollection
    private List<Integer> sergey;
    public Person() {
    }

    public Person(String name, List<HomeAdress> homeAdress) {
        this.name = name;
        this.homeAdress =  homeAdress;
    }

    public Person(String name, List<HomeAdress> homeAdress, List<Integer> sergey) {
        this.name = name;
        this.homeAdress = homeAdress;
        this.sergey = sergey;
    }
}
