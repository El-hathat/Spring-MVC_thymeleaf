package com.thyme.demo;


import com.thyme.demo.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.thyme.demo.models.Patient;
import java.util.Date;

@Component
public class DataInitialiser {

    @Bean
    CommandLineRunner initDatabase(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(new Patient(null, "Ali", new Date(), false));
            patientRepository.save(new Patient(null, "Fatima", new Date(), true));
            patientRepository.save(new Patient(null, "Omar", new Date(), false));
            patientRepository.save(new Patient(null, "Sara", new Date(), true));
        };
    }
}
