package com.esprit.microservice.jobservice;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Integer> {

    Optional<Job> findByService(String service);

    List<Job> findByEtat(boolean etat);
}
