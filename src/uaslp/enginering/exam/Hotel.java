package uaslp.enginering.exam;

import uaslp.enginering.exam.model.Guest;
import uaslp.enginering.exam.model.Reservation;
import uaslp.enginering.exam.model.RoomStatus;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Reservation> reservations;
    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name) {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRoom(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }


    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nigths) {

        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nigths);

        reservations.add(reservation);

    }

    public void addRoom(Room room) {

        rooms.add(room);
    }


    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
