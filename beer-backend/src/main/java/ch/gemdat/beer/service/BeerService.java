package ch.gemdat.beer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ch.gemdat.beer.entity.Beer;
import ch.gemdat.beer.repository.BeerRepository;

@Service
public class BeerService {

    BeerRepository beerRepo;

    public BeerService(BeerRepository beerRepository) {
        this.beerRepo = beerRepository;
    }

    public Optional<Beer> getById(Integer id) {
        return beerRepo.findById(id);
    }

    public List<Beer> getAll() {
        return beerRepo.findAll();
    }

}