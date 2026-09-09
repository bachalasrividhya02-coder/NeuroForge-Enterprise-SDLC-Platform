package NeuroForge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import NeuroForge.entity.Requirement;

public interface RequirementRepository extends JpaRepository<Requirement, Integer> {

}