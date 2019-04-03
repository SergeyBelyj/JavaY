package Hibernate.enums;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.hibernate.annotations.SortComparator;

import javax.persistence.*;
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

    public List<Integer> getMarks() {
        return marks;
    }


}
