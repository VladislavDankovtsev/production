package ru.dankovtsev.production.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dankovtsev.production.client.ProductionClientForArduino;
import ru.dankovtsev.production.model.Production;
import ru.dankovtsev.production.uuid.UUIDRandom;

@Service
public class ProductionService {

    @Autowired
    private ProductionClientForArduino productionClientForArduino;

    public Production onlineSystem(){
        Production production = productionClientForArduino.onlineProduction();
        return production;
    }
}
