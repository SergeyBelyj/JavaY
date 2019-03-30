package Hibernate.enums;

import javax.persistence.*;

@Entity
public class HomeAdress {
    @Id
    @GeneratedValue
    int id;
    String street;
    @ManyToOne
    Person person;

    public HomeAdress(String street) {
        this.street = street;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
