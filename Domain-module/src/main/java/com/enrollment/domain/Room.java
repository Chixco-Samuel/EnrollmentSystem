package com.enrollment.domain;

public class Room {
    private String roomId;
    private String roomNumber;

    public Room(String roomId, String roomNumber) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
    }

    public String getRoomId() { return roomId; }
    public String getRoomNumber() { return roomNumber; }
}
