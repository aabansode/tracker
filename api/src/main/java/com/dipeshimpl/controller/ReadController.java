package com.dipeshimpl.controller;

import com.dipeshimpl.entity.Reading;
import com.dipeshimpl.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * The class is the controller for read entity which executes the post method to create the readings.
 *
 * @author Dipesh Nainani
 */

@CrossOrigin
@RestController
@RequestMapping(path = "/readings")
public class ReadController {

    @Autowired
    ReadService readService;

    /**
     * The method helps in creating the readings for the vehicles.
     *
     * @param readings contains values of different reading objects
     * @return readings given by the user
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

    public Reading create(@RequestBody Reading readings) {
        return readService.create(readings);
    }

    /**
     * The method helps in getting the reading for the vehicles.
     *
     * @param vin vin number passed as string
     * @return reading of the car
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{vin}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Reading findOne(@PathVariable String vin) {
        return readService.findOne(vin);
    }

}
