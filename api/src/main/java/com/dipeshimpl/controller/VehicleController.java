package com.dipeshimpl.controller;

import com.dipeshimpl.entity.Vehicle;
import com.dipeshimpl.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The class is the controller for vehicle entity which executes different methods
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

    /**
     * The method helps in adding vehicle object to the database
     *
     * @param vehicle vehicle object
     * @return vehicle
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle create(@RequestBody Vehicle vehicle) {
        return vehicleService.create(vehicle);
    }

    /**
     * The method helps in deleting any vehicle object
     *
     * @param vehicle vehicle object
     */
    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void delete(@RequestBody Vehicle vehicle) {
        vehicleService.delete(vehicle);
    }

    /**
     * The method helps in getting all the vehicles
     *
     * @return list of vehicles
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> findAll() {
        return vehicleService.findAll();
    }

    /**
     * The method helps in getting a particular vehicle object
     *
     * @param vin VIM number of the vehicle
     * @return vehicle
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{vin}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle findOne(@PathVariable String vin) {
        return vehicleService.findOne(vin);
    }
}
