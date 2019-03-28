package Hibernate;

import Hibernate.enums.Days;
import Hibernate.enums.HomeAdress;
import Hibernate.enums.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;


public class WhatIsHibernate {
    public static void main(String[] args) {
     final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
      try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession()) {
          session.beginTransaction();
          HomeAdress homeAdress = new HomeAdress("Lenina");
          Person person = new Person("Sertgey", homeAdress);
          //  session.persist(homeAdress);
          homeAdress.setPerson(person);
          session.persist(homeAdress);
            session.persist(person);
        //  session.save(new Student("sergey", Days.MONDAY, new Date()));
        //  Student load =  session.load(Student.class,4);
        //  Student get =  session.get(Student.class, 4);
        //  System.out.println(load.getIsPlusAge());
        //  System.out.println(get.getName());
//          Student sergey = new Student("Sergey", Days.TUESDAY);
//          sergey.setAdress(new Adress("swientojerska", 22));
//          session.save(sergey);
          session.getTransaction().commit();
        }
      }
}
