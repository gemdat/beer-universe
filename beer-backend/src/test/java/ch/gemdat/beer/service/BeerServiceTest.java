package ch.gemdat.beer.service;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import ch.gemdat.beer.entity.Beer;
import ch.gemdat.beer.repository.BeerRepository;

@ExtendWith(MockitoExtension.class)
public class BeerServiceTest {

    @InjectMocks
    BeerService beerService;
    @Mock
    BeerRepository beerRepo;

    @Test
    void testGetAll() {
        when(beerService.getAll()).thenReturn(List.of(mock(Beer.class)));
        beerService.getAll();
        verify(beerRepo, times(1)).findAll();
    }

    @Test
    void testGetById() {
        when(beerService.getById(anyInt())).thenReturn(Optional.of(mock(Beer.class)));
        beerService.getById(1);
        verify(beerRepo, times(1)).findById(anyInt());
    }

}