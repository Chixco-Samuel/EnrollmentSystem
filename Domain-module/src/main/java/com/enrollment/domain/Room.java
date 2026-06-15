package com.enrollment.domain;

public class Room {
    private final String roomCode;
    private final int capacity;

    public Room (String roomCode, int capacity) {
        this.roomCode = roomCode;
        this.capacity = capacity;
    }

    public String getRoomCode () {
        return roomCode;
    }

    public int getCapacity () {
        return capacity;
    }
}