package NeuroForge.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NeuroForge.entity.Deployment;
import NeuroForge.repository.DeploymentRepository;

@RestController
@RequestMapping("/api/deployments")
public class DeploymentController {

    private final DeploymentRepository deploymentRepository;

    public DeploymentController(DeploymentRepository deploymentRepository) {
        this.deploymentRepository = deploymentRepository;
    }

    @GetMapping
    public List<Deployment> getDeployments() {
        return deploymentRepository.findAll();
    }

    @PostMapping
    public Deployment createDeployment(@RequestBody Deployment deployment) {
        return deploymentRepository.save(deployment);
    }
}