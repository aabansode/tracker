package com.dipeshimpl.repository;

import com.dipeshimpl.entity.Reading;
import java.util.List;

public interface ReadRepository {
    Reading findOne(String vin);
    Reading create(Reading reading);
    Reading update(Reading reading);
    void delete(Reading reading);
}
