package NeuroForge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import NeuroForge.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}