package com.dipeshimpl.controller;

import com.dipeshimpl.entity.Reading;
import com.dipeshimpl.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/readings")
public class ReadController {

    @Autowired
    ReadService readService;

    @RequestMapping(method = RequestMethod.POST)
    public Reading create(@RequestBody Reading readings) {
        return readService.create(readings);
    }

}
