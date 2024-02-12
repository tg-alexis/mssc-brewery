package alexis.springframework.msscbrewery.services;

import alexis.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .name("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc(337010000000L)
                .build();
    }
}
