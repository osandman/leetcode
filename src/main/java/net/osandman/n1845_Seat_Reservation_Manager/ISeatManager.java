package net.osandman.n1845_Seat_Reservation_Manager;

public interface ISeatManager {
    int reserve();
    void unreserve(int seatNumber);
}
