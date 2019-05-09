package Hibernate;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class WhatIsHibernate extends Thread{
    public static void main(String[] args) {
     final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
      try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession()){

          session.beginTransaction();
          Query query = session.createQuery("select c.number from Car c group by c.number having c.number <> '12'");

          List<String> list = query.list();

          for(String car : list) {
              System.out.println(car);
          }

          session.getTransaction().commit();

      }
    }
}
