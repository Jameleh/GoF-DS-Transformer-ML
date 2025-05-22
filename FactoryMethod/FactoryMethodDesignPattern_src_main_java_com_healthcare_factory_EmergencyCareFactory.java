package com.healthcare.factory;

import com.healthcare.services.EmergencyCare;
import com.healthcare.services.HealthcareService;

public class EmergencyCareFactory implements HealthcareServiceFactory{

    @Override
    public HealthcareService createHealthcareService() {
        return new EmergencyCare();
    }
}
