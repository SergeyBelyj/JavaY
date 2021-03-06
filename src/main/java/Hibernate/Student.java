package Hibernate;

import Hibernate.enums.Days;
import org.hibernate.annotations.*;
import sun.java2d.loops.GeneralRenderer;

import javax.persistence.*;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "student")
 class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//    private UUID id;

    @Basic
//    @Column(name = "name")
//    @Type(type =  "text")
    @Access(AccessType.FIELD)
  private   String name;
    @Enumerated(EnumType.STRING)
    private Days days;
//    @Temporal(TemporalType.DATE)
 //   @CreationTimestamp

    @UpdateTimestamp
    private Date date;
    private int age = 20;
    @Formula("id + age")
    private int isPlusAge;

@EmbeddedId
    private Adress adress;


    Student(String name, Days days) {
        this.name = name;
        this.days = days;
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

//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return "Mr." + name;
    }

    public void setName(String name) {
        this.name =  name;
    }

    public int getIsPlusAge() {
        return isPlusAge;
    }

    public void setIsPlusAge(int isPlusAge) {
        this.isPlusAge = isPlusAge;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

//    public UUID getID() {
//        return id;
//    }
//
//    public void setID(UUID id) {
//        this.id = id;
//    }
}
