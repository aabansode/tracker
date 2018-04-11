package com.dipeshimpl.controller;

import com.dipeshimpl.entity.Alert;
import com.dipeshimpl.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The class is the controller for alert entity which executes different methods
 * to process the vehicles.
 *
 * @author Dipesh Nainani
 */

@CrossOrigin
@RestController
@RequestMapping(path = "/alerts")
public class AlertController {

    @Autowired
    ReadService readService;

    /**
     * The method helps in returning the list of alerts with type.
     * @param type type of alert
     * @return list of alerts
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{type}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Alert> findAll(@PathVariable("type") String type) {
        return readService.findAll(type);
    }
}
