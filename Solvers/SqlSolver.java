package com.example.autosolver.service;

import com.example.autosolver.util.SqlFileReader;

public class Question2Solver implements SqlSolver {

    @Override
    public String questionCode() {
        return "Q2";
    }

    @Override
    public String finalQuery() {
        
        return SqlFileReader.readSqlFile("sql/question2.sql");
    }
}
