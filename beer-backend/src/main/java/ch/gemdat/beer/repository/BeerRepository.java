package ch.gemdat.beer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.gemdat.beer.entity.Beer;

public interface BeerRepository extends JpaRepository<Beer, Integer> {

}