package edu.coderhouse.real.state.project.services;

import edu.coderhouse.real.state.project.entities.Client;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoFactory {
  private final SessionFactory sessionFactory;

  @Autowired
  public DaoFactory(EntityManagerFactory factory) {
    this.sessionFactory = factory.unwrap(SessionFactory.class);
  }

  public void create(Object object) throws Exception {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.persist(object);
    session.getTransaction().commit();
  }

  public void update(Object object) throws Exception {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.merge(object);
    session.getTransaction().commit();
  }

  public void delete(Object object) throws Exception {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.remove(object);
    session.getTransaction().commit();
  }

  public Client getClient(long id) throws Exception {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    Client client = session.get(Client.class, id);
    session.getTransaction().commit();
    return client;
  }
}
