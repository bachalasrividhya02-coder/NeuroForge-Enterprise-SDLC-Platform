package NeuroForge.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NeuroForge.entity.Requirement;
import NeuroForge.repository.RequirementRepository;

@RestController
@RequestMapping("/api/requirements")
public class RequirementController {

    private final RequirementRepository requirementRepository;

    public RequirementController(RequirementRepository requirementRepository) {
        this.requirementRepository = requirementRepository;
    }

    @GetMapping
    public List<Requirement> getRequirements() {
        return requirementRepository.findAll();
    }

    @PostMapping
    public Requirement createRequirement(@RequestBody Requirement requirement) {
        return requirementRepository.save(requirement);
    }
}