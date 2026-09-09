package NeuroForge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import NeuroForge.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

}