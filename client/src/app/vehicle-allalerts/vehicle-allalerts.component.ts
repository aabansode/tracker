import { Component, OnInit } from '@angular/core';
import {CarService} from '../car-service/car.service.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-vehicle-allalerts',
  templateUrl: './vehicle-allalerts.component.html',
  styleUrls: ['./vehicle-allalerts.component.css']
})
export class VehicleAllalertsComponent implements OnInit {

  cars;
  constructor(private route: ActivatedRoute, private carService: CarService) {
    this.route.params.subscribe(params => {
      this.carService.getVehicleWithType('HIGH')
      .subscribe(cars => this.cars = cars);
    });
  }

  ngOnInit() {
  }

}
