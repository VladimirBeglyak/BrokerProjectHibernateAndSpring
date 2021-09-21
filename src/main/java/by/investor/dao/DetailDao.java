package by.investor.dao;

import by.investor.entity.Detail;
import by.investor.entity.StorageStock;
import by.investor.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DetailDao implements Dao<Long, Detail>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Detail detail) {
        Session session = sessionFactory.openSession();
        session.save(detail);
    }

    @Override
    @Transactional
    public void update(Detail detail) {
        Session session = sessionFactory.openSession();
        session.save(detail);
    }

    @Override
    @Transactional
    public void delete(Detail detail) {
        Session session = sessionFactory.openSession();
        session.save(detail);
    }

    @Override
    @Transactional
    public Detail findById(Long id) {
        Session session = sessionFactory.openSession();
        Detail detail = session.get(Detail.class, id);
        return detail;
    }

    @Override
    @Transactional
    public List<Detail> findAll() {
        Session session = sessionFactory.openSession();
        List<Detail> details = session.createQuery("select d from Detail d").getResultList();
        return details;
    }
}
