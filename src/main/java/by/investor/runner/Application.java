package by.investor.runner;

import by.investor.dao.ClientDao;
import by.investor.dao.CurrencyDao;
import by.investor.dao.DetailDao;
import by.investor.dao.StorageStockDao;
import by.investor.entity.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Application {
    public static void main(String[] args) {
//        ClientDao clientDao = new ClientDao();
//        DetailDao detailDao = new DetailDao();
//        CurrencyDao currencyDao = new CurrencyDao();
//        StorageStockDao storageStockDao = new StorageStockDao();
//
//        Client client = new Client("test2@mail.ru", "qwerty", Role.ADMIN);
//        Detail detail = new Detail("Max","Director","Ulan","belarus"
//        , LocalDate.of(1980,12,31),"7778789TR6ER","+375-29-123-47-96");
//        client.setDetail(detail);
//
//        clientDao.save(client);
//        Client foundClient = clientDao.findById(2L);
//        System.out.println(foundClient);
//        System.out.println(foundClient.getDetail());
//*************************************************************************************

//        Currency currency = new Currency("USD", "Dollar of USA");
//        Currency currency1 = new Currency("EUR", "Euro of European Union");
//        StorageStock storageStock = new StorageStock("O", "Realty Income", 30000L, 50.5, "Europe Union", 0.95);
//        storageStock.addCurrencyToStock(currency1);
//
//        storageStockDao.save(storageStock);

//*************************************************************************************
//        Currency usd = new Currency("USD", "Dollar of USA");
//        Currency euro = new Currency("EUR", "Euro of European Union");
//        Currency foundCurrency = currencyDao.findById(2L);
//        StorageStock storageStock = new StorageStock("PEP", "Pepsi Inc", 2000000L, 156.45, "USA", 3.47);
//        StorageStock storageStock1 = new StorageStock("O", "Realty Income", 47000L, 70.4, "USA", 1.45);
//
//        storageStock1.setCurrency(euro);
//        storageStock1.setCurrency(usd);
//
//        storageStockDao.save(storageStock);
//        storageStockDao.save(storageStock1);
//        storageStockDao.save(storageStock);

//        List<StorageStock> storageStocks = storageStockDao.selectStocksByAllCurrency("O");
//        System.out.println(storageStocks);

//        StorageStockDao storageStockDao = new StorageStockDao();
//        List<StorageStock> all = storageStockDao.findAll();
//        System.out.println(all);


    }
}
