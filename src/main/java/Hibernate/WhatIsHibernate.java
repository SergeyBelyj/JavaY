package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class WhatIsHibernate {
    public static void main(String[] args) {
     final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
      try(SessionFactory sessionFactory = new MetadataSources(registry).addAnnotatedClass(Student.class).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession()) {
          session.beginTransaction();
          session.save(new Student("sergey"));
          session.getTransaction().commit();
        }
      }
}