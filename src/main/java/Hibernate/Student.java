package Hibernate;

import Hibernate.enums.Days;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
 class Student {
    @Id
    @GeneratedValue
    int id;
    @Basic
//    @Column(name = "name")
//    @Type(type =  "text")
    String name;

    @Enumerated(EnumType.STRING)
    private Days days;
    @Temporal(TemporalType.DATE)
    private Date date;


    Student() {
    }

public Student(String name, Days days, Date date) {
    this.days = days;
    this.name = name;
    this.date = date;
}



    public Days getDays() {
        return days;
    }
    public void setDays(Days days) {
        this.days = days;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
