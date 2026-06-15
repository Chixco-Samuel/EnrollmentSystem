package com.enrollment.domain;

public class Faculty {
    private final int facultyID;
    private final String name;
    private final String department;
    
    public Faculty (int facultyID, String name, String department) {
        this.facultyID = facultyID;
        this.name = name;
        this.department = department;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}