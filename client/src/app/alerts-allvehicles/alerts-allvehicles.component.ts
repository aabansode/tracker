import { Component, OnInit } from '@angular/core';
import {CarService} from '../car-service/car.service.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-alerts-allvehicles',
  templateUrl: './alerts-allvehicles.component.html',
  styleUrls: ['./alerts-allvehicles.component.css']
})
export class AlertsAllvehiclesComponent implements OnInit {

  cars;
  constructor(private carService: CarService, private route: ActivatedRoute) {
    this.route.params.subscribe(params => {
      this.carService.getVehicleWithType('HIGH')
        .subscribe(cars => this.cars = cars);
    });
  }
  ngOnInit() {
  }

}
