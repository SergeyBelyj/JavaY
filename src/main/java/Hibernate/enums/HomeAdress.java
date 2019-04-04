package Hibernate.enums;

import javax.persistence.*;
import java.util.List;

//@Entity
@Embeddable
public class HomeAdress {
//    @Id
//    @GeneratedValue
//    int id;
    String street;



    public HomeAdress() {
    }

    public HomeAdress(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
