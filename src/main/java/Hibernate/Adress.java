package Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
    String street;
    int number;

    Adress() {}

    public Adress(String street, int i) {
        this.street = street;
        this.number = i;

    }
}
