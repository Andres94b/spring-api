package com.andresbonilla.portfolio.dao;

import com.andresbonilla.portfolio.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ResumeDao extends JpaRepository<Resume, UUID> {

}
