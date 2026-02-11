package com.esprit.microservice.jobservice;


import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobRestAPI {

    private final JobService jobService;

    public JobRestAPI(JobService jobService) {
        this.jobService = jobService;
    }

    // Afficher tous
    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    // Afficher par id
    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Integer id) {
        return jobService.getJobById(id)
                .orElseThrow(() -> new RuntimeException("Job not found"));
    }

    // Afficher par nom
    @GetMapping("/service/{service}")
    public Job getJobByService(@PathVariable String service) {
        return jobService.getJobByService(service)
                .orElseThrow(() -> new RuntimeException("Job not found"));
    }

    // Modifier état
    @PutMapping("/{id}/etat")
    public Job updateEtat(@PathVariable Integer id,
                          @RequestParam boolean etat) {
        return jobService.updateEtat(id, etat);
    }
}
