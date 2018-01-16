package com.dipeshimpl.service;

import com.dipeshimpl.entity.Alert;
import com.dipeshimpl.entity.Reading;

import java.util.List;

/**
 * The interface declares method for the reading service.
 * @author Dipesh Nainani
 */
public interface ReadService {

    /**
     * The method acts like a POST and helps in creating the readings.
     *
     * @param readings details of the reading entered by the user
     * @return reading
     */

    Reading create(Reading readings);

    /**
     * This method helps in getting the reading of the car.
     * @param vin vin number of the car
     * @return reading of the vehicle
     */
    List<Reading> findReadings(String vin);

    /**
     * This method helps in getting alerts with a type
     * @param type type of alerts
     * @return list of alerts
     */
    List<Alert> findAll(String type);
}
