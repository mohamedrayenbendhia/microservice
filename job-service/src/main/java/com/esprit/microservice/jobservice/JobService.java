package com.esprit.microservice.jobservice;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // Afficher tous les jobs
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // Afficher par ID
    public Optional<Job> getJobById(Integer id) {
        return jobRepository.findById(id);
    }

    // Afficher par nom (service)
    public Optional<Job> getJobByService(String service) {
        return jobRepository.findByService(service);
    }

    // Modifier l’état
    public Job updateEtat(Integer id, boolean etat) {
        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        job.setEtat(etat);
        return jobRepository.save(job);
    }
}
