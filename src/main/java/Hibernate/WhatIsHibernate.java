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
import java.util.Date;
import java.util.List;


public class WhatIsHibernate {
    public static void main(String[] args) {
     final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
      try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession()) {
          session.beginTransaction();
          HomeAdress homeAdress = new HomeAdress("Lenina");
          List<HomeAdress> list = new ArrayList<>();
          list.add(homeAdress);
          Person person = new Person("Sertgey", list);
          List<Person> people = new ArrayList<>();
          people.add(person);
          homeAdress.setPerson(people);
          session.persist(homeAdress);
          session.persist(person);
          session.getTransaction().commit();
        }
      }
}
