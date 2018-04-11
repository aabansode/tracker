import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { VehicleDetailsComponent } from './vehicle-details/vehicle-details.component';
import {CarService} from './car-service/car.service.service';
import { VehicleLocationComponent } from './vehicle-location/vehicle-location.component';
import { VehicleAllalertsComponent } from './vehicle-allalerts/vehicle-allalerts.component';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule} from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { UserPageComponent } from './user-page/user-page.component';
import { VehicleSignalComponent } from './vehicle-signal/vehicle-signal.component';
import { AlertsAllvehiclesComponent } from './alerts-allvehicles/alerts-allvehicles.component';

const appRoutes: Routes = [
  {path: 'front', component: UserPageComponent},
  {path: 'vehicle-signal', component: VehicleSignalComponent},
  {path: 'vehicle-allalerts', component: VehicleAllalertsComponent},
  {path: 'vehicle-location', component: VehicleLocationComponent},
  {path: 'vehicle-details', component: VehicleDetailsComponent},
  {path: 'alert-allvehicles', component: AlertsAllvehiclesComponent},
  {path: '', redirectTo: 'front', pathMatch: 'full'}
];

@NgModule({
  declarations: [
    AppComponent,
    VehicleDetailsComponent,
    VehicleLocationComponent,
    VehicleAllalertsComponent,
    UserPageComponent,
    VehicleSignalComponent,
    AlertsAllvehiclesComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  exports: [RouterModule],
  providers: [CarService],
  bootstrap: [AppComponent]
})
export class AppModule { }
