package ru.dankovtsev.production.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import ru.dankovtsev.production.model.Production;
import ru.dankovtsev.production.repository.ProductionRepository;

@Configuration
@EnableScheduling
public class ProductionServiceConfig {
    public static Production production;

    @Autowired
    private ProductionService productionService;
    @Autowired
    private ProductionRepository productionRepository;

    @Scheduled(fixedDelay = 10000)
    public void scheduleFixInformationInBD(){
        try{
            production = productionService.onlineSystem();
            if(production!=null){
                productionRepository.save(production);
            }
            System.out.println("SAVE");
        }catch(Exception e){
            System.out.println("нет соединения с arduino");
        }
    }

    public Production getProduction(){
        return production;
    }
}
