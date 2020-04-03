package ru.dankovtsev.production.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.dankovtsev.production.model.Production;
import ru.dankovtsev.production.uuid.UUIDRandom;

import java.time.LocalDateTime;

import static ru.dankovtsev.production.other.UrlSmartCityModule.URL_PRODUCTION_ONLINE;

@Service
public class ProductionClientForArduino {

    @Autowired
    private UUIDRandom uuidRandom;

    public Production onlineProduction(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Production> responseEntity = restTemplate.getForEntity(URL_PRODUCTION_ONLINE,
            Production.class);
        responseEntity.getBody().setId(uuidRandom.randomkey());
        responseEntity.getBody().setTime(LocalDateTime.now());
        return responseEntity.getBody();
    }
}
