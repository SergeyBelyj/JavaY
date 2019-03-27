package Hibernate;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
 class Student {
    @Id
    @GeneratedValue
    int id;

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    @Basic
    @Column(name = "name")
    @Type(type =  "text")

    String name;
    @Type(type = "timestamp")
    private Date dt;

public Student() {

}

    public Student(String name) {
        this.name = name;
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
