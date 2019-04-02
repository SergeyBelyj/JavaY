package Hibernate.enums;

import javax.persistence.*;
import java.util.List;

@Entity
public class HomeAdress {
    @Id
    @GeneratedValue
    int id;
    String street;
     @ManyToMany
    List<Person> person;

    public HomeAdress() {
    }

    public HomeAdress(String street) {
        this.street = street;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
}
