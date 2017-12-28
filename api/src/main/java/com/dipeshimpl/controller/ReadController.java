package com.dipeshimpl.controller;

import com.dipeshimpl.entity.Reading;
import com.dipeshimpl.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "reading")
public class ReadController {

    @Autowired
    ReadService readService;

    @PostMapping
    public List<Reading> postAll(List<Reading> readings) {
        return readService.postAll(readings);
    }

}
