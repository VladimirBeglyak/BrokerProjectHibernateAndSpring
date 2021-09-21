package by.investor.controller;

import by.investor.dao.ClientDao;
import by.investor.dao.StorageStockDao;
import by.investor.entity.Client;
import by.investor.entity.StorageStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private StorageStockDao storageStockDao;

    @RequestMapping("/clients")
    public String showAllClients(Model model){
        List<Client> allClients = clientDao.findAll();
        model.addAttribute("allClients",allClients);

        Client client = clientDao.findById(1L);
        model.addAttribute("client",client);
        return "all-clients";
    }

    @RequestMapping("/")
    public String showAllStocks(Model model){
        List<StorageStock> allStocks = storageStockDao.findAll();
        model.addAttribute("stocks",allStocks);

        StorageStock storageStock = storageStockDao.findById(1L);
        model.addAttribute("stock",storageStock);
        return "all-stocks";
    }
}
