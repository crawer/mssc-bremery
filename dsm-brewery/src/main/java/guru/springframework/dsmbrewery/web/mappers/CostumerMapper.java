package guru.springframework.dsmbrewery.web.mappers;

import guru.springframework.dsmbrewery.domain.Costumer;
import guru.springframework.dsmbrewery.web.model.CostumerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CostumerMapper {

    CostumerDto costumerDtoToCostumer(Costumer costumer);

    Costumer costumerToCostumerDto(CostumerDto Dto);

}
