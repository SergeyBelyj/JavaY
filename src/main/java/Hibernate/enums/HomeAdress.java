package Hibernate.enums;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class HomeAdress {
    @Id
    @GeneratedValue
    int id;
    String street;
    @OneToOne
    Person person;

    public HomeAdress(String street) {
        this.street = street;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
