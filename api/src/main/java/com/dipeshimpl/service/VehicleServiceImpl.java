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

    /**
     * The method implements logic to create vehicle object.
     *
     * @param vehicle vehicle object to be created
     * @return vehicle
     */

    @Transactional
    public Vehicle create(Vehicle vehicle) {

        if(vehicle!=null) {
            vehicleRepository.create(vehicle);
            return vehicle;
        }
        return null;
    }

    /**
     * The method implements logic to find the list of vehicles.
     *
     * @return list of vehicles
     */

    @Transactional(readOnly = true)
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    /**
     * The method implements logic to delete a particular vehicle object.
     *
     * @param vehicle vehicle object
     */

    @Transactional
    public void delete(Vehicle vehicle) {

        if(vehicle!=null) {
            vehicleRepository.delete(vehicle);
        }
    }

    /**
     * The method implements logic to find the vehicle with the help of its vin number
     *
     * @param vin VIN number of the vehicle
     * @return vehicle
     */

    @Transactional(readOnly = true)
    public Vehicle findOne(String vin) {
        if(vin!=null || vin!="") {
            return vehicleRepository.findOne(vin);
        }
        return null;
    }
}
