package NeuroForge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "deployment")
public class Deployment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deploymentId;

    private String version;

    private String environment;

    private String deployDate;

    private String status;

    private Integer projectId;

    private Integer deployedBy;

    private String notes;

    public Deployment() {
    }

    public Integer getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(Integer deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getDeployDate() {
        return deployDate;
    }

    public void setDeployDate(String deployDate) {
        this.deployDate = deployDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getDeployedBy() {
        return deployedBy;
    }

    public void setDeployedBy(Integer deployedBy) {
        this.deployedBy = deployedBy;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}