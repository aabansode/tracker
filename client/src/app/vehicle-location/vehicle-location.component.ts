import { Component, OnInit } from '@angular/core';
import {CarService} from '../car-service/car.service.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-vehicle-location',
  templateUrl: './vehicle-location.component.html',
  styleUrls: ['./vehicle-location.component.css']
})
export class VehicleLocationComponent implements OnInit {
  cars;
  constructor(private carService: CarService, private route: ActivatedRoute) {
    this.route.params.subscribe(params => {
      carService.getVehicleWithVin(params.vin)
        .subscribe(cars => this.cars = cars);
    });
  }

  ngOnInit() {
  }

}
