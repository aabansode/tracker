import { Component, OnInit } from '@angular/core';
import {CarService} from '../car-service/car.service.service';

@Component({
  selector: 'app-vehicle-details',
  templateUrl: './vehicle-details.component.html',
  styleUrls: ['./vehicle-details.component.css']
})
export class VehicleDetailsComponent implements OnInit {
  cars;

  constructor(private carService: CarService) {
    carService.getVehicles().subscribe(
      cars => this.cars = cars,
      error => console.log(error)
    );
  }

  ngOnInit() {}

}
