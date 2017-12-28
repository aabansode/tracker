package com.dipeshimpl.service;

import com.dipeshimpl.entity.Reading;
import com.dipeshimpl.repository.ReadRepository;
import com.dipeshimpl.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReadServiceImpl implements ReadService{

    @Autowired
    ReadRepository readRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    @Transactional
    public Reading create(Reading readings) {

        if(vehicleRepository.findOne(readings.getVin()) != null) {
            readRepository.create(readings);
            return readings;
        } else {
            return null;
        }
    }
}
