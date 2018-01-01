package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Reading;
import java.util.List;

/**
 * This is an interface for the readings repository.
 * It declares CRUD methods
 *
 * @author Dipesh Nainani
 */

public interface ReadRepository {

    /**
     * The method helps in getting the reading details with the help of
     * VIN number
     *
     * @param vin VIM number of the vehicle
     * @return details of the reading
     */

    Reading findOne(String vin);

    /**
     * The method helps in creating the entry for the readings.
     *
     * @param reading details of the reading
     * @return reading entered by the user
     */

    Reading create(Reading reading);

    /**
     * The method helps in updating the entry for the readings.
     *
     * @param reading details of the reading
     * @return reading entered by the user
     */

    Reading update(Reading reading);

    /**
     * The method helps in deleting the entry for the readings.
     *
     * @param reading details of the reading
     */

    void delete(Reading reading);
}
