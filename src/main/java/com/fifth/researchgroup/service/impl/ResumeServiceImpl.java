package com.fifth.researchgroup.service.impl;

import com.fifth.researchgroup.dao.ResumeDao;
import com.fifth.researchgroup.entity.Resume;
import com.fifth.researchgroup.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;
    @Override
    public void addResume(Resume resume) {
        resumeDao.addResume(resume);
    }

    @Override
    public void updateResume(Resume resume) {
        resumeDao.updateResume(resume);
    }
}
