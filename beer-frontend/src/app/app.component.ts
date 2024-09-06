import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { DataViewModule } from 'primeng/dataview';
import { DialogModule } from 'primeng/dialog';
import { Beer } from './model/beer.model';
import { BeerService } from './service/beer.service';
import { CountryService } from './service/country.service';
import { CountryNamePipe } from './model/countryName.pipe';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, DataViewModule, ButtonModule, CardModule, DialogModule, CountryNamePipe],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'beer-frontend';
  beers: Beer[] = [];
  visible: boolean = false;
  currentBeer: Beer | undefined;

  constructor(
    private countryService: CountryService,
    private beerService: BeerService) {
  };

  ngOnInit() {
    this.beerService.getAllBeers().subscribe(beers => this.beers = beers);
  }

  onDetailsClick(beer: Beer): void{
    this.currentBeer = beer;
    this.visible = true;
  }

}