package by.investor.dao;

import by.investor.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ClientDao implements Dao<Long, Client>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Client client) {
        Session session = sessionFactory.openSession();
        session.save(client);
    }

    @Override
    @Transactional
    public void update(Client client) {
        Session session = sessionFactory.openSession();
        session.update(client);
    }

    @Override
    @Transactional
    public void delete(Client client) {
        Session session = sessionFactory.openSession();
        session.delete(client);
    }

    @Override
    @Transactional
    public Client findById(Long id) {
        Session session = sessionFactory.openSession();
        Client client = session.get(Client.class, id);
        return client;
    }

    @Override
    @Transactional
    public List<Client> findAll() {
        Session session = sessionFactory.openSession();
        List<Client> clients=session.createQuery("select c from Client c",Client.class).getResultList();
        return clients;
    }
}
