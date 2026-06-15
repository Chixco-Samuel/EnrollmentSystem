package com.enrollment.domain;

public  class Grade {
    private final int studentID;
    private final String courseCode;
    private final double value;
    
    public Grade (int studentID, String courseCode, double value) {
        this.studentID = studentID;
        this.courseCode = courseCode;
        this.value = value;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public double getValue() {
        return value;
    }
}