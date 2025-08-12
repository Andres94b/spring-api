package com.andresbonilla.portfolio.service;

import com.andresbonilla.portfolio.dao.ResumeDao;
import com.andresbonilla.portfolio.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ResumeService {
    private final ResumeDao resumeDao;

    @Autowired
    public ResumeService(ResumeDao resumeDao) {
        this.resumeDao = resumeDao;
    }

    public Resume saveResume(Resume resume){
        return resumeDao.save(resume);
    }

    public List<Resume> getAllResumes(){
        return resumeDao.findAll();
    }
}
