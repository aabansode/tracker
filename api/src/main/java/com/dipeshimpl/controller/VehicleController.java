package com.dipeshimpl.controller;

import com.dipeshimpl.entity.Vehicle;
import com.dipeshimpl.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PutMapping
    public List<Vehicle> putAll(List<Vehicle> vehicleList) {
        return vehicleService.putAll(vehicleList);
    }
}
