package com.enrollment.domain;

public class Grade {
    private String studentId;
    private String subjectId;
    private double finalGrade;

    public Grade(String studentId, String subjectId, double finalGrade) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.finalGrade = finalGrade;
    }

    public String getStudentId() { return studentId; }
    public String getSubjectId() { return subjectId; }
    public double getFinalGrade() { return finalGrade; }
}