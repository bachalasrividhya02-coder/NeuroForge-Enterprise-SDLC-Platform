package NeuroForge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import NeuroForge.entity.TestCase;
import NeuroForge.repository.TestCaseRepository;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {

    @Autowired
    private TestCaseRepository testCaseRepository;

    @GetMapping
    public List<TestCase> getTestCases() {
        return testCaseRepository.findAll();
    }

    @PostMapping
    public TestCase createTestCase(@RequestBody TestCase testCase) {
        return testCaseRepository.save(testCase);
    }
}