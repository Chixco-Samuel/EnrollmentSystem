package com.enrollment.domain;

public class Schedule {
    private String id;
    private String sectionId;
    private String roomId;
    private String facultyId;
    private String subjectId; 
    private String day;
    private String time;

    public Schedule(String id, String sectionId, String roomId, String facultyId, String subjectId, String day, String time) {
        this.id = id;
        this.sectionId = sectionId;
        this.roomId = roomId;
        this.facultyId = facultyId;
        this.subjectId = subjectId;
        this.day = day;
        this.time = time;
    }

    public String getId() { return id; }
    public String getSectionId() { return sectionId; }
    public String getRoomId() { return roomId; }
    public String getFacultyId() { return facultyId; }
    public String getSubjectId() { return subjectId; }
    public String getDay() { return day; }
    public String getTime() { return time; }
}