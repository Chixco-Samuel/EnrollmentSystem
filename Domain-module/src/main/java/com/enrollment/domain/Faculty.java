package com.enrollment.domain;

public class Faculty {
    private String facultyId;
    private String name;

    public Faculty(String facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public String getFacultyId() { return facultyId; }
    public String getName() { return name; }
}