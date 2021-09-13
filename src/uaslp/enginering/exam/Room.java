package uaslp.enginering.exam;

import uaslp.enginering.exam.model.RoomStatus;

import java.util.ArrayList;

public class Room extends ArrayList<Room> {
    private int number;
    private String status;
    private RoomStatus roomStatus;

    public Room(int number, String status, RoomStatus roomStatus) {
        this.number = number;
        this.status = status;
        this.roomStatus = roomStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}
