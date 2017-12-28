package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Reading;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ReadRepositoryImpl implements ReadRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Reading findOne(String vin) {
        return entityManager.find(Reading.class, vin);
    }

    public Reading create(Reading reading) {
        entityManager.persist(reading);
        return reading;
    }

    public Reading update(Reading reading) {
        return entityManager.merge(reading);
    }

    public void delete(Reading reading) {
        entityManager.remove(reading);
    }
}
