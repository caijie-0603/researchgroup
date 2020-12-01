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
    public int updateResume(Resume resume) {
        return resumeDao.updateResume(resume);
    }

    @Override
    public Resume queryResumeById(int id) {
        return resumeDao.queryResumeById(id);
    }
}
