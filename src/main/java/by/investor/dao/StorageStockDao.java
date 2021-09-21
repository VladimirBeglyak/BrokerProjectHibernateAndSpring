package by.investor.dao;

import by.investor.entity.StorageStock;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StorageStockDao implements Dao<Long, StorageStock>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(StorageStock storageStock) {
        Session session = sessionFactory.openSession();
        session.save(storageStock);
    }

    @Override
    @Transactional
    public void update(StorageStock storageStock) {
        Session session = sessionFactory.openSession();
        session.update(storageStock);
    }

    @Override
    @Transactional
    public void delete(StorageStock storageStock) {
        Session session = sessionFactory.openSession();
        session.delete(storageStock);
    }

    @Override
    @Transactional
    public StorageStock findById(Long id) {
        Session session = sessionFactory.openSession();
        StorageStock storageStock = session.get(StorageStock.class, id);
        return storageStock;
    }

    @Override
    @Transactional
    public List<StorageStock> findAll() {
        Session session = sessionFactory.openSession();
        List<StorageStock> storageStocks=session.createQuery("select ss from StorageStock ss",StorageStock.class).getResultList();
        return storageStocks;
    }

    @Transactional
    public List<StorageStock> selectStocksByAllCurrency(String ticker){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select ss.name,ss.country,ss.count,ss.ticker,ss.price,ss.currency from StorageStock ss where ss.ticker=:ticker");
        query.setParameter("ticker",ticker);
        return query.getResultList();
    }
}
