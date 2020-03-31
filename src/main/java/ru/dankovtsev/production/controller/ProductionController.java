package ru.dankovtsev.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.dankovtsev.production.model.Production;
import ru.dankovtsev.production.service.ProductionService;
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
}
