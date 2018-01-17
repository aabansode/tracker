import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/catch';


@Injectable()
export class CarService {

  private carsUrl = 'http://localhost:8080/api/vehicles/';
  private readingUrl = 'http://localhost:8080/api/readings/';
  private alertUrl = 'http://localhost:8080/api/alerts/';
  constructor(private http: HttpClient) { }

  getVehicles(): Observable<any[]> {
    return this.http.get<any[]>(this.carsUrl)
      .catch(error  => Observable.throw(error.statusText));
  }

  getVehicleWithVin(vin: String): Observable<any[]> {
    return this.http.get<any[]>('http://localhost:8080/api/readings/${vin}')
      .map(response => response)
      .catch(error => Observable.throw(error.statusText));
  }
  getVehicleWithType(type: String): Observable<any[]> {
    return this.http.get<any[]>('http://localhost:8080/api/alerts/${type}')
      .map(response => response)
      .catch(error => Observable.throw(error.statusText));
  }

}
