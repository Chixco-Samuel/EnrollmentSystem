package com.enrollment.dto;

import java.util.List;

public class EnrollmentRequestDTO {
    private String studentId;
    private List<String> requestedSubjectIds;

    public EnrollmentRequestDTO(String studentId, List<String> requestedSubjectIds) {
        this.studentId = studentId;
        this.requestedSubjectIds = requestedSubjectIds;
    }

    public String getStudentId() { return studentId; }
    public List<String> getRequestedSubjectIds() { return requestedSubjectIds; }
}