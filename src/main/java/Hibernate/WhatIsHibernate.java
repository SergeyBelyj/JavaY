package Hibernate;

import Hibernate.enums.Days;
import Hibernate.enums.HomeAdress;
import Hibernate.enums.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;


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
//
//          Person person = new Person("Sertgey", list, marks);//
//          session.persist(person);
//
          Person load = session.load(Person.class, 10);
          System.out.println(load.getMarks());

          session.getTransaction().commit();



        }
    }
}
