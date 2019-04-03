package Hibernate.enums;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ElementCollection
    private List<HomeAdress> homeAdress;
    @ElementCollection
//    @OrderBy("marks")
//    @OrderColumn
//    @org.hibernate.annotations.OrderBy(clause = "marks DESC")
//    @SortComparator(MyComporator.class)
    private List<Integer> marks;
    @NaturalId
    private String iCode;
    public Person() {
    }

    public Person(String name, List<HomeAdress> homeAdress) {
        this.name = name;
        this.homeAdress =  homeAdress;
    }

    public Person(String name, List<HomeAdress> homeAdress, List<Integer> marks) {
        this.name = name;
        this.homeAdress = homeAdress;
        this.marks = marks;
    }

    public Person(String name, List<HomeAdress> homeAdress, List<Integer> marks, String iCode) {
        this.name = name;
        this.homeAdress = homeAdress;
        this.marks = marks;
        this.iCode = iCode;
    }

    public List<Integer> getMarks() {
        return marks;
        }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homeAdress=" + homeAdress +
                ", marks=" + marks +
                ", iCode='" + iCode + '\'' +
                '}';
    }
}
