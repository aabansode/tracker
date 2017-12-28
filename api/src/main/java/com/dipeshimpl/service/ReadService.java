package com.dipeshimpl.service;

import com.dipeshimpl.entity.Reading;
import java.util.List;

public interface ReadService {

    List<Reading> postAll(List<Reading> readings);
}
