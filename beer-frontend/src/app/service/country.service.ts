import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Beer } from '../model/beer.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  constructor(private http: HttpClient) { }

  getCountryName(isoCode: string): Observable<any> {
    let countryApi = `https://public.opendatasoft.com/api/explore/v2.1/catalog/datasets/countries-codes/records?select=label_en&where=iso2_code%3D%27${isoCode}%27&limit=1`;
    return this.http.get(countryApi);
  }

}