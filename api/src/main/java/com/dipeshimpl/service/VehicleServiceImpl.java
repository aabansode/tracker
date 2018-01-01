package com.dipeshimpl.service;

import com.dipeshimpl.entity.Vehicle;
import com.dipeshimpl.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The class is an implementation of vehicle service interface.
 *
 * @author Dipesh Nainani
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    /**
     * The method implements a PUT operation on the list of vehicles.
     *
     * @param vehicles list of vehicles given by the user
     * @return list of vehicles
     */
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
