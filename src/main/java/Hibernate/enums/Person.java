package Hibernate.enums;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne(mappedBy = "person")
    @JoinColumn(name = "HomeId")
    private HomeAdress homeAdress;

    public Person(String name, HomeAdress homeAdress) {
        this.name = name;
        this.homeAdress = homeAdress;
    }
}
