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
//    @OneToOne(fetch = FetchType.LAZY)
//    @LazyToOne(LazyToOneOption.NO_PROXY)
//    @OneToMany(mappedBy = "person")
    @ManyToMany
//    @JoinColumn(name = "HomeId")
    private List<HomeAdress> homeAdress;

    public Person() {
    }

    public Person(String name, List<HomeAdress> homeAdress) {
        this.name = name;
        this.homeAdress =  homeAdress;
    }
}
