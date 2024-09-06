package ch.gemdat.beer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.gemdat.beer.entity.Beer;
import ch.gemdat.beer.service.BeerService;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/{id}")
    public ResponseEntity<Beer> getById(@PathVariable Integer id) {
        // TODO: load beer by ID and return
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Beer>> getAll() {
        return ResponseEntity.ok(beerService.getAll());
    }

}