package com.healthcare.client;

import com.healthcare.factory.EmergencyCareFactory;
import com.healthcare.factory.GeneralConsultationFactory;
import com.healthcare.factory.HealthcareServiceFactory;
import com.healthcare.factory.SpecialistConsultationFactory;
import com.healthcare.services.HealthcareService;

public class HealthcareClient {
    public static void main(String[] args) {
        HealthcareServiceFactory healthcareServiceFactory;

        //Creating a General consultation service
        healthcareServiceFactory = new GeneralConsultationFactory();
        HealthcareService healthcareService1 = healthcareServiceFactory.createHealthcareService();
        healthcareService1.provideService();

        //Creating a Specialist consultation service
        healthcareServiceFactory = new SpecialistConsultationFactory();
        HealthcareService healthcareService2 = healthcareServiceFactory.createHealthcareService();
        healthcareService2.provideService();

        // Creating a Emergency consultation service
        healthcareServiceFactory = new EmergencyCareFactory();
        HealthcareService healthcareService3 = healthcareServiceFactory.createHealthcareService();
        healthcareService3.provideService();
    }
}
