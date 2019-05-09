package Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class WhatIsHibernate extends Thread{
    public static void main(String[] args) {
     final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
      try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession()){

          session.beginTransaction();
//          Car car = new Car("12");
//          session.persist(car);
          Query query = session.createQuery("from Car  where number = :number2 or id = :myId");
          query.setParameter("number2", "321");
          query.setParameter("myId",3);

          Car car = (Car) query.uniqueResult();
          System.out.println(car.getId());
//          List<Car> list = query.list();
          session.getTransaction().commit();

      }
    }
}
