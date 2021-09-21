package by.investor.dao;

import java.util.List;

public interface Dao <K,T> {

    void save(T t);
    void update(T t);
    void delete(T t);
    T findById(K id);
    List<T> findAll();

}
