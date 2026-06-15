package com.enrollment.dto;

public class EnrollmentRequestDTO {

    private String studentId;
    private String courseCode;
    private String sectionId;

    public EnrollmentRequestDTO() {
    }

    public EnrollmentRequestDTO(String studentId, String courseCode, String sectionId) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.sectionId = sectionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public String toString() {
        return "EnrollmentRequestDTO{" +
                "studentId='" + studentId + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", sectionId='" + sectionId + '\'' +
                '}';
    }
}