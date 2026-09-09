package NeuroForge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import NeuroForge.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}