package guru.springframework.dsmbrewery.services;

import guru.springframework.dsmbrewery.web.model.CostumerDto;

import java.util.UUID;

public interface CostumerService {

    CostumerDto saveNewCostumer(CostumerDto costumerDto);

    CostumerDto getCostumerById(UUID costumerId);

    void updateCostumer(UUID costumerId, CostumerDto costumerDto);

    void deleteCostumerId(UUID costumerId);
}
