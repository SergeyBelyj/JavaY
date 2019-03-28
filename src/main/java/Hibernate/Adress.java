package Hibernate;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
//@Access(AccessType.FIELD)
public class Adress implements Serializable {
   // @Transient
    String street;
    int number;

    Adress() {}

    public Adress(String street, int i) {
        this.street = street;
        this.number = i;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return number == adress.number &&
                Objects.equals(street, adress.street);
    }

    @Override
    public int hashCode() {

        return Objects.hash(street, number);
    }
}
