package com.healthcare.factory;

import com.healthcare.services.GeneralConsultation;
import com.healthcare.services.HealthcareService;

public class GeneralConsultationFactory implements HealthcareServiceFactory{

    @Override
    public HealthcareService createHealthcareService() {
        return new GeneralConsultation();
    }
}
