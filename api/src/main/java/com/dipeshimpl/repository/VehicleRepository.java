package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Vehicle;
import java.util.List;

/**
 * This is an interface for the vehicle repository.
 * It declares CRUD methods
 *
 * @author Dipesh Nainani
 */

public interface VehicleRepository {

    /**
     * The method helps in getting all the vehicles.
     *
     * @return list of vehicles
     */

    List<Vehicle> findAll();

    /**
     * The method helps in getting a specific vehicle with the help of its VIN number.
     *
     * @param vin VIN number of the vehicle
     * @return details of the vehicle
     */

    Vehicle findOne(String vin);

    /**
     * The method helps in creating a new entry for the vehicle
     *
     * @param vehicle details of the vehicle
     * @return vehicle entered by the user
     */

    Vehicle create(Vehicle vehicle);

    /**
     * The method helps in updating the entry of the vehicle
     *
     * @param vehicle details of the vehicle
     * @return vehicle entered by the user
     */

    Vehicle update(Vehicle vehicle);

    /**
     * The method helps in deleting the entry of the vehicle
     *
     * @param vehicle details of the vehicle
     */

    void delete(Vehicle vehicle);
}
