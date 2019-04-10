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

          Car car = new Car("123");
          System.out.println(car.getId());
          session.persist(car);
          session.flush();
          System.out.println(car.getId());
//          car.setNumber("321");
//          session.detach(car);
//          car.setNumber("456");
//          session.remove(car);
          car.setNumber("789");
          session.refresh(car);
//          System.out.println(car.getId());
//          System.out.println(car.getNumber());
//          session.merge(car);
//          session.update(car);
//          session.persist(car2);
//          session.persist(car3);


          session.getTransaction().commit();



        }
    }
}
