package com.enrollment.domain;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private List<String> completedCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.completedCourses = new ArrayList<>();
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public List<String> getCompletedCourses() { return completedCourses; }
    
    public void completeCourse(String courseCode) {
        this.completedCourses.add(courseCode);
    }
}