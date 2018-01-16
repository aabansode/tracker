package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Alert;

import java.util.List;

/**
 * The interface declares the method to store the alerts in the database.
 *
 * @author Dipesh Nainani
 */

public interface AlertRepository {

    /**
     * The method helps in creating the alert and storing in the database.
     * @param alert alert object
     * @return alert
     */

    Alert create(Alert alert);

    /**
     * The method helps in getting alert by type
     * @param type type of the alert
     * @return alert
     */
    List<Alert> findAlert(String type);


}
