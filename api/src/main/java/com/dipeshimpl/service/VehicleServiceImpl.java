package com.dipeshimpl.service;

import com.dipeshimpl.entity.Vehicle;
import com.dipeshimpl.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Transactional
    public List<Vehicle> putAll(List<Vehicle> vehicles) {

        for(Vehicle v: vehicles) {
            if(vehicleRepository.findOne(v.getVin()) == null) {
                 vehicleRepository.create(v);
            } else {
                 vehicleRepository.update(v);
            }
        }
        return vehicles;
    }
}
