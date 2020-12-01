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

    @PutMapping("/resume/update")
    public int update(Resume resume)    //返回0表示未修改成功，返回1表示修改成功
    {
        return resumeService.updateResume(resume);
    }

    @GetMapping("/resume/queryResumeById")
    public Resume queryResumeById(int id)
    {
        return resumeService.queryResumeById(id);
    }
}
