package NeuroForge.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NeuroForge.entity.Organization;
import NeuroForge.repository.OrganizationRepository;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    private final OrganizationRepository organizationRepository;

    public OrganizationController(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @GetMapping
    public List<Organization> getOrganizations() {
        return organizationRepository.findAll();
    }

    @PostMapping
    public Organization createOrganization(@RequestBody Organization organization) {
        return organizationRepository.save(organization);
    }
}