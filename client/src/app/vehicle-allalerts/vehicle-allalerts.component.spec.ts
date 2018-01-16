import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicleAllalertsComponent } from './vehicle-allalerts.component';

describe('VehicleAllalertsComponent', () => {
  let component: VehicleAllalertsComponent;
  let fixture: ComponentFixture<VehicleAllalertsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VehicleAllalertsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicleAllalertsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
