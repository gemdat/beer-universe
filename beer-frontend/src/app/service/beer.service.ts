import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Beer } from '../model/beer.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BeerService {

  beerApi = "/api/v1/beer";

  constructor(private http: HttpClient) { }

  getAllBeers(): Observable<Beer[]> {
    return this.http.get<Beer[]>(this.beerApi);
  }

}