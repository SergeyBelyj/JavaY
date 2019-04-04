package Hibernate;

import Hibernate.enums.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WhatIsHibernate {
    public static void main(String[] args) {
     final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
      try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession()) {
          session.beginTransaction();
//
//          HomeAdress homeAdress = new HomeAdress("Lenina");
//          List<HomeAdress> list = new ArrayList<>();
//          list.add(homeAdress);
//          list.add(new HomeAdress("Mala"));
//
//          List<Integer> marks = new ArrayList<>();
//          marks.add(1);
//          marks.add(3);
//          marks.add(2);

//        Person iCode =  session.byNaturalId(Person.class).using("iCode","124").getReference();
//          System.out.println(iCode);
//          Person person = new Person("Sertgey", list, marks,"123");//
//          session.persist(person);

//          Person load = session.load(Person.class, 10);
//          System.out.println(load.getMarks());

//          Map<String,String> book = new HashMap<>();
//          book.put("isbn", "asdf");
//          book.put("title", "e32r4f");
//          book.put("author", "ewfgfvb7463gf");
//          session.save("Book", book);
          Car car = new Toyota("123", "220");
          Car car2 = new Opel("321", 20000);
          Car car3 = new Car("213");
          session.persist(car);
          session.persist(car2);
//          session.persist(car3);


          session.getTransaction().commit();



        }
    }
}
