package guru.springframework.dsmbrewery.service.impl;

import guru.springframework.dsmbrewery.services.CostumerService;
import guru.springframework.dsmbrewery.web.model.CostumerDto;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class ConstumerServiceImpl implements CostumerService {


    public CostumerDto getCostumerById(UUID costumerId){

        return CostumerDto.builder().id(UUID.randomUUID())
                .name("Douglas da Silva Machado")
                .build();
    }

    @Override
    public CostumerDto saveNewCostumer(CostumerDto costumerDto) {
        return costumerDto.builder()
                .id(UUID.randomUUID())
                .name("Douglas")
                .build();
    }

    @Override
    public void updateCostumer(UUID costumerId, CostumerDto costumerDto) {
        //todo function update
    }

    @Override
    public void deleteCostumerId(UUID costumerId) {
        log.debug("Deletando um cliente...");
    }


}
