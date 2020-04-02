package ru.dankovtsev.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.dankovtsev.production.model.CheckConnection;
import ru.dankovtsev.production.model.Production;
import ru.dankovtsev.production.service.ProductionServiceConfig;

@RestController
@RequestMapping("/production")
public class ProductionController {

    @Autowired
    private ProductionServiceConfig productionServiceConfig;

    @RequestMapping(path = "/online", method = RequestMethod.GET)
    public Production getProductionNow(){
        return productionServiceConfig.getProduction();
    }

    @RequestMapping(path = "/check", method = RequestMethod.GET)
    public CheckConnection getAgricultureConnection(){
        CheckConnection checkConnection = new CheckConnection();
        checkConnection.setCheck("work");
        return checkConnection;
    }
}
