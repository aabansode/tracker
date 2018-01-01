package com.dipeshimpl.service;

import com.dipeshimpl.entity.Vehicle;
import java.util.List;

/**
 * The interface declares the methods for the vehicles.
 *
 * @author Dipesh Nainani
 */
public interface VehicleService {

    /**
     * The method implements a PUT operation.
     *
     * @param vehicles list of vehicles given by the user
     * @return list of vehicles
     */
    List<Vehicle> putAll(List<Vehicle> vehicles);

    /**
     * The method is declared to create vehicle object.
     *
     * @param vehicle vehicle object to be created
     * @return vehicle
     */
    Vehicle create(Vehicle vehicle);

    /**
     * The method is declared to delete a particular vehicle object.
     *
     * @param vehicle vehicle object
     */
    void delete(Vehicle vehicle);

    /**
     * The method is declared to find the vehicle with the help of its vin number
     *
     * @param vin VIN number of the vehicle
     * @return vehicle
     */
    Vehicle findOne(String vin);

    /**
     * The method is declared to find the list of vehicles.
     *
     * @return list of vehicles
     */
    List<Vehicle> findAll();
}
