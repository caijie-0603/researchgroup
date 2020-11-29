package com.fifth.researchgroup.controller;

import com.fifth.researchgroup.entity.Resume;
import com.fifth.researchgroup.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/resume/update")
    public void update(Resume resume)
    {
        resumeService.updateResume(resume);
    }
}
