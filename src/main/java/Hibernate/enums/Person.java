package Hibernate.enums;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne(fetch = FetchType.LAZY)
    @LazyToOne(LazyToOneOption.NO_PROXY)
    @JoinColumn(name = "HomeId")
    private  HomeAdress homeAdress;

    public Person(String name, HomeAdress homeAdress) {
        this.name = name;
        this.homeAdress = homeAdress;
    }
}
