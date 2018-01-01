package com.dipeshimpl.controller;

import com.dipeshimpl.entity.Vehicle;
import com.dipeshimpl.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The class is the controller for vehicle entity which executes the put method
 * to process the vehicles.
 *
 * @author Dipesh Nainani
 */

@CrossOrigin
@RestController
@RequestMapping(path = "/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    /**
     * This method helps in putting the list of vehicles and the value of different objects
     * passed by the user.
     *
     * @param vehicleList contains list of vehicles with values of different object in JSON format
     * @return list of all vehicles
     */
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> putAll(@RequestBody List<Vehicle> vehicleList) {
        return vehicleService.putAll(vehicleList);
    }
}
