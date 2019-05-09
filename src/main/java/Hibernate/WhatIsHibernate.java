package Hibernate;

import Hibernate.enums.*;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static sun.misc.PostVMInitHook.run;

public class WhatIsHibernate {
    public static void main(String[] args) {
     final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
      try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Session session2 = sessionFactory.openSession()){

          session.beginTransaction();
          Car car = new Car("123");
          session.persist(car);
          session.getTransaction().commit();

        final int carId = car.getId();

          new Thread(() -> {
              session.beginTransaction();
              Car car1 = session.load(Car.class, carId, LockMode.PESSIMISTIC_WRITE);
              car1.setNumber(car1.getNumber() + "4");
              session.getTransaction().commit();
              try {Thread.sleep(7000);} catch (InterruptedException e) {}

          }).start();

          new Thread() {
              @Override
              public void run() {
                  session2.beginTransaction();
                  Car car = session2.load(Car.class, carId, LockMode.PESSIMISTIC_WRITE);
                  car.setNumber(car.getNumber() + "5");
                  session2.getTransaction().commit();
              }
          }.start();
          try {Thread.sleep(600);} catch (InterruptedException e) {}
      }
    }
}
