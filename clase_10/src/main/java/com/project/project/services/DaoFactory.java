package com.project.project.services;

import com.project.project.entities.Client;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaoFactory {
  private final SessionFactory sessionFactory;

  @Autowired
  public DaoFactory(EntityManagerFactory factory) {
    this.sessionFactory = factory.unwrap(SessionFactory.class);
  }

  public void create(Object obj) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.persist(obj);
    session.getTransaction().commit();
  }

  public void update(Object obj) throws Exception {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.merge(obj);
    session.getTransaction().commit();
  }

  public void delete(Object obj) throws Exception {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.remove(obj);
    session.getTransaction().commit();
  }

  public Client getClient(long id) throws Exception {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    Client cliente = session.get(Client.class, id);
    session.getTransaction().commit();
    return cliente;
  }

  public List<Client> getClients() throws Exception {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    List<Client> clientes = session.createQuery("from Client").list();
    session.getTransaction().commit();
    return clientes;
  }
}