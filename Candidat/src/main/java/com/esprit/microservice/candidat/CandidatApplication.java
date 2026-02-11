package com.esprit.microservice.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidatApplication.class, args);
    }
    @Autowired
    private CandidatRepository repository;
    @Bean
    ApplicationRunner init() {
        return (args) -> {
            repository.save(new Candidat("Rayen", "Ben Dhia","rayen@esprit.tn"));
            repository.save(new Candidat("Khalil","Yacoubi","khalil@esprit.tn"));
            repository.save(new Candidat("Emmanuel","Yemmeli","emmanuel@esprit.tn"));
            repository.save(new Candidat("Wassim","Boukhris","wassim@esprit.tn"));
            repository.save(new Candidat("Sirine","Benchikh","sirine@esprit.tn"));
            repository.save(new Candidat("Yassine","Amri","yassine@esprit.tn"));
            repository.findAll().forEach(System.out::println);
        };

    }
}
