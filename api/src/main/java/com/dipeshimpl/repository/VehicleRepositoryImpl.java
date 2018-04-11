package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * The class is an implementation of the vehicle repository interface.
 * It uses entity manager to execute operations and uses typed query
 * to find all the entries of the vehicles.
 *
 * @author Dipesh Nainani
 */

@Repository
public class VehicleRepositoryImpl implements VehicleRepository{

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * The method helps in getting all the vehicles.
     *
     * @return list of vehicles
     */

    public List<Vehicle> findAll() {
        TypedQuery<Vehicle> query = entityManager.createNamedQuery("Vehicle.findAll", Vehicle.class);
        return query.getResultList();
    }

    /**
     * The method helps in getting a specific vehicle with the help of its VIN number.
     *
     * @param vin VIN number of the vehicle
     * @return details of the vehicle
     */

    public Vehicle findOne(String vin) {
        return entityManager.find(Vehicle.class,vin);
    }

    /**
     * The method helps in creating a new entry for the vehicle
     *
     * @param vehicle details of the vehicle
     * @return vehicle entered by the user
     */

    public Vehicle create(Vehicle vehicle) {
        entityManager.persist(vehicle);
        return vehicle;
    }

    /**
     * The method helps in updating the entry of the vehicle
     *
     * @param vehicle details of the vehicle
     * @return vehicle entered by the user
     */

    public Vehicle update(Vehicle vehicle) {
        return entityManager.merge(vehicle);
    }

    /**
     * The method helps in deleting the entry of the vehicle
     *
     * @param vehicle details of the vehicle
     */

    public void delete(Vehicle vehicle) {
        entityManager.remove(entityManager.contains(vehicle) ? vehicle : entityManager.merge(vehicle));
    }
}
