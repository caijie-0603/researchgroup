package com.fifth.researchgroup.dao;

import com.fifth.researchgroup.entity.Resume;

public interface ResumeDao {

    public void addResume(Resume resume);       //新增成员简历   id为成员的id

    public void updateResume(Resume resume);    //修改成员简历

}
