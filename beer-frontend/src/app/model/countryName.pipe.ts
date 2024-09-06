import { Pipe, PipeTransform } from "@angular/core";
import { CountryService } from "../service/country.service";
import { map, Observable, of } from "rxjs";

@Pipe
    ({
        standalone: true,
        name: 'countryNamePipe'
    })
export class CountryNamePipe implements PipeTransform {

    constructor(private countryService: CountryService) { }

    transform(isoCode: string): Observable<string | undefined> {
        if (isoCode) {
            return this.countryService.getCountryName(isoCode).pipe(map(c => {
                return c.results[0].label_en + " * ";
            }));
        }
        return of(undefined)
    }

}