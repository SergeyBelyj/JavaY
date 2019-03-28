package Hibernate;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class Adress {
    String street;
    int number;

    Adress() {}

    public Adress(String street, int i) {
        this.street = street;
        this.number = i;

    }
}
