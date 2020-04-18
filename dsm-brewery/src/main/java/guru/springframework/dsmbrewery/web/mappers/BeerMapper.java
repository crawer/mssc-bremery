package guru.springframework.dsmbrewery.web.mappers;

import guru.springframework.dsmbrewery.domain.Beer;
import guru.springframework.dsmbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);



}
