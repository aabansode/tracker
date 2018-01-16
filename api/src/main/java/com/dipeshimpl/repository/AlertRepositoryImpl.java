package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Alert;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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

    /**
     * The method helps in getting alert based on type
     * @param type type of the alert
     * @return
     */
    public List<Alert> findAlert(String type) {
        TypedQuery<Alert> query = entityManager.createNamedQuery("Alert.findAll", Alert.class);
        query.setParameter("typealer", type);
        List<Alert> resultList = query.getResultList();
        return resultList;
    }

}
