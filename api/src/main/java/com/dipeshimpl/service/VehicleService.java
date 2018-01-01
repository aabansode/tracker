package com.dipeshimpl.service;

import com.dipeshimpl.entity.Vehicle;
import java.util.List;

/**
 * The interface declares the put method for the vehicles.
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
}
