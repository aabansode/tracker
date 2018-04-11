import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlertsAllvehiclesComponent } from './alerts-allvehicles.component';

describe('AlertsAllvehiclesComponent', () => {
  let component: AlertsAllvehiclesComponent;
  let fixture: ComponentFixture<AlertsAllvehiclesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlertsAllvehiclesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlertsAllvehiclesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
