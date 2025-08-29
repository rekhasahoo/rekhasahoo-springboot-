package com.example.autosolver.repo;


import com.example.autosolver.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubmissionRepository extends JpaRepository<Submission, Long> {}
