package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Alert;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * The class implements the method in the alert repository interface.
 * It makes use of entity manager to store the alert.
 *
 * @author Dipesh Nainani
 */

@Repository
public class AlertRepositoryImpl implements AlertRepository{

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * The method helps in creating the alert and storing in the database.
     * @param alert alert object
     * @return alert
     */

    public Alert create(Alert alert) {
        entityManager.persist(alert);
        return alert;
    }
}
