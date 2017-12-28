package com.dipeshimpl.controller;

import com.dipeshimpl.entity.Vehicle;
import com.dipeshimpl.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.PUT)
    public List<Vehicle> putAll(@RequestBody List<Vehicle> vehicleList) {
        return vehicleService.putAll(vehicleList);
    }
}
