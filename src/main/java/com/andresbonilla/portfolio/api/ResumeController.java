package com.andresbonilla.portfolio.api;

import com.andresbonilla.portfolio.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.andresbonilla.portfolio.service.ResumeService;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("resumes")
@RestController
public class ResumeController {

    private final ResumeService resumeService;

    @Autowired
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping
    public Resume saveResume(@RequestBody Resume resume){
        return resumeService.saveResume(resume);
    }

    @GetMapping
    public List<Resume> getAllResumes(){
        return resumeService.getAllResumes();
    }
}
