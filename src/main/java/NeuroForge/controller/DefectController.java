package NeuroForge.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NeuroForge.entity.Defect;
import NeuroForge.repository.DefectRepository;

@RestController
@RequestMapping("/api/defects")
public class DefectController {

    private final DefectRepository defectRepository;

    public DefectController(DefectRepository defectRepository) {
        this.defectRepository = defectRepository;
    }

    @GetMapping
    public List<Defect> getDefects() {
        return defectRepository.findAll();
    }

    @PostMapping
    public Defect createDefect(@RequestBody Defect defect) {
        return defectRepository.save(defect);
    }
}