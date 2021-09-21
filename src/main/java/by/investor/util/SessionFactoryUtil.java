package by.investor.util;

import by.investor.entity.Client;
import by.investor.entity.Currency;
import by.investor.entity.Detail;
import by.investor.entity.StorageStock;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

    private static SessionFactory sessionFactory;

    private SessionFactoryUtil(){}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory==null){
            try{
                Configuration configuration = new Configuration();
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Detail.class);
                configuration.addAnnotatedClass(StorageStock.class);
                configuration.addAnnotatedClass(Currency.class);

                sessionFactory=configuration
                        .buildSessionFactory(new StandardServiceRegistryBuilder().build());
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        return sessionFactory;
    }
}
