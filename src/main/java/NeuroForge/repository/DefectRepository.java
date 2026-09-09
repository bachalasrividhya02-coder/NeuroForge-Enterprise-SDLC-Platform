package NeuroForge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import NeuroForge.entity.Defect;

public interface DefectRepository extends JpaRepository<Defect, Integer> {

}