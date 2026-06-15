package com.enrollment.dto;

public class ScheduleAssignmentDTO {
    private String sectionId;
    private String roomId;
    private String facultyId;
    private String subjectId;
    private String day;
    private String time;

    public ScheduleAssignmentDTO(String sectionId, String roomId, String facultyId, String subjectId, String day, String time) {
        this.sectionId = sectionId;
        this.roomId = roomId;
        this.facultyId = facultyId;
        this.subjectId = subjectId;
        this.day = day;
        this.time = time;
    }

    public String getSectionId() { return sectionId; }
    public String getRoomId() { return roomId; }
    public String getFacultyId() { return facultyId; }
    public String getSubjectId() { return subjectId; }
    public String getDay() { return day; }
    public String getTime() { return time; }
}
