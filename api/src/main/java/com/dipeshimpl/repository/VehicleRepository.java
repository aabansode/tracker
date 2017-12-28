package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Vehicle;
import java.util.List;

public interface VehicleRepository {

    List<Vehicle> findAll();
    Vehicle findOne(String vin);
    Vehicle create(Vehicle vehicle);
    Vehicle update(Vehicle vehicle);
    void delete(Vehicle vehicle);
}
