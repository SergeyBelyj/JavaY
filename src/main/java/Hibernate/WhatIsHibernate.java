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
//          Car car = new Car("12");
//          session.persist(car);
          Query query = session.createQuery("select  distinct c.number from Car c");
//          query.setParameter("number2", "321");
//          query.setParameter("myId",3);
          List<Car> list = query.list();
          System.out.println(list.size());

//          Car car = (Car) query.uniqueResult();
//          System.out.println(car.getId());
          session.getTransaction().commit();

      }
    }
}
