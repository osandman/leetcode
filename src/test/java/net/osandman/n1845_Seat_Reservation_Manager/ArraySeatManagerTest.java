package net.osandman.n1845_Seat_Reservation_Manager;

import org.junit.jupiter.api.Test;

class ArraySeatManagerTest {

    @Test
    public void reserveThreeFromTenSeats() {
        SeatManagerTests.reserveThreeFromTenSeats(new ArraySeatManager(10));
    }

    @Test
    public void reserveAndUnreserveFromTwoSeats() {
        SeatManagerTests.reserveAndUnreserveFromTwoSeats(new ArraySeatManager(2));
    }

    @Test
    public void reserveAndUnreserveFromTenSeats() {
        SeatManagerTests.reserveAndUnreserveFromTenSeats(new ArraySeatManager(10));
    }
}