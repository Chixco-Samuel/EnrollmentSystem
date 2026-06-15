package com.enrollment.domain;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String title;
    private int maxCapacity;
    private List<String> prerequisites;

    public Course(String courseCode, String title, int maxCapacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.maxCapacity = maxCapacity;
        this.prerequisites = new ArrayList<>();
    }

    public String getCourseCode() { return courseCode; }
    public String getTitle() { return title; }
    public int getMaxCapacity() { return maxCapacity; }
    public List<String> getPrerequisites() { return prerequisites; }

    public void addPrerequisite(String courseCode) {
        this.prerequisites.add(courseCode);
    }
}