package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Reading;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * The class is an implementation of the read repository interface.
 * It makes use of entity manager to execute the operations on the
 * database.
 * @author Dipesh Nainani
 */

@Repository
public class ReadRepositoryImpl implements ReadRepository {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * The method helps in getting the reading details with the help of
     * VIN number
     *
     * @param vin VIM number of the vehicle
     * @return details of the reading
     */

    public Reading findOne(String vin) {
        return entityManager.find(Reading.class, vin);
    }

    /**
     * The method helps in creating the entry for the readings.
     *
     * @param reading details of the reading
     * @return reading entered by the user
     */

    public Reading create(Reading reading) {
        entityManager.persist(reading);
        return reading;
    }

    /**
     * The method helps in updating the entry for the readings.
     *
     * @param reading details of the reading
     * @return reading entered by the user
     */

    public Reading update(Reading reading) {
        return entityManager.merge(reading);
    }

    /**
     * The method helps in deleting the entry for the readings.
     *
     * @param reading details of the reading
     */

    public void delete(Reading reading) {
        entityManager.remove(reading);
    }
}
