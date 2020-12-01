package com.fifth.researchgroup.service;

import com.fifth.researchgroup.entity.Resume;

public interface ResumeService {

    public void addResume(Resume resume);       //新增成员简历

    public int updateResume(Resume resume);    //修改成员简历

    public Resume queryResumeById(int id);      //根据成员id查找简历

}
