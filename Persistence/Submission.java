package com.example.autosolver.model;


import jakarta.persistence.*;
import java.time.Instant;


@Entity
public class Submission {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String regNo;
private String question; // "Q1" or "Q2"


@Column(length = 8000)
private String finalQuery;


private Instant createdAt = Instant.now();


public Submission() {}
public Submission(String regNo, String question, String finalQuery) {
this.regNo = regNo; this.question = question; this.finalQuery = finalQuery;
}


public Long getId() { return id; }
public String getRegNo() { return regNo; }
public void setRegNo(String regNo) { this.regNo = regNo; }
public String getQuestion() { return question; }
public void setQuestion(String question) { this.question = question; }
public String getFinalQuery() { return finalQuery; }
public void setFinalQuery(String finalQuery) { this.finalQuery = finalQuery; }
public Instant getCreatedAt() { return createdAt; }
public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
