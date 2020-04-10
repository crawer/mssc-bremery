package guru.springframework.dsmbrewery.services;

import guru.springframework.dsmbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto getBeerById(UUID beerId);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeerId(UUID beerId);
}
