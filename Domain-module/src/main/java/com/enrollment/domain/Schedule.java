package com.enrollment.domain;

public class Schedule {
    private final String day;
    private final String startTime;
    private final String endTime;

    private final Faculty faculty;
    private final Room room;

    public Schedule (String day, String startTime, String endTime, Faculty faculty, Room room) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.faculty = faculty;
        this.room = room;
    }

    public String getDay() {
        return day;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Room getRoom() {
        return room;
    }
}