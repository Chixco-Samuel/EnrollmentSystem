package com.enrollment.dto;

public class ScheduleAssignmentDTO {

    private String courseCode;
    private String facultyId;
    private String roomId;
    private String day;
    private String startTime;
    private String endTime;

    public ScheduleAssignmentDTO() {
    }

    public ScheduleAssignmentDTO(
            String courseCode,
            String facultyId,
            String roomId,
            String day,
            String startTime,
            String endTime) {

        this.courseCode = courseCode;
        this.facultyId = facultyId;
        this.roomId = roomId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "ScheduleAssignmentDTO{" +
                "courseCode='" + courseCode + '\'' +
                ", facultyId='" + facultyId + '\'' +
                ", roomId='" + roomId + '\'' +
                ", day='" + day + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}