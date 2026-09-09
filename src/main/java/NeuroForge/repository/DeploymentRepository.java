package NeuroForge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import NeuroForge.entity.Deployment;

public interface DeploymentRepository extends JpaRepository<Deployment, Integer> {

}