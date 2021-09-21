package by.investor.dao;

import by.investor.entity.Currency;
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
public class CurrencyDao implements Dao<Long, Currency> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Currency currency) {
        Session session = sessionFactory.openSession();
        session.save(currency);
        session.close();
    }

    @Override
    @Transactional
    public void update(Currency currency) {
        Session session = sessionFactory.openSession();
        session.update(currency);
        session.close();
    }

    @Override
    @Transactional
    public void delete(Currency currency) {
        Session session = sessionFactory.openSession();
        session.delete(currency);
        session.close();
    }

    @Override
    @Transactional
    public Currency findById(Long id) {
        Session session = sessionFactory.openSession();
        Currency currency = session.get(Currency.class, id);
        session.close();
        return currency;
    }

    @Override
    @Transactional
    public List<Currency> findAll() {
        Session session = sessionFactory.openSession();
        List<Currency> currencies=session.createQuery("select c from Currency c").getResultList();
        session.close();
        return currencies;
    }
}
