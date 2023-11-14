package net.osandman.n1845_Seat_Reservation_Manager;

import org.junit.jupiter.api.Test;

class PriorityQueueSeatManagerTest {

    @Test
    public void reserveThreeFromTenSeats() {
        SeatManagerTests.reserveThreeFromTenSeats(new PriorityQueueSeatManager(10));
    }

    @Test
    public void reserveAndUnreserveFromTwoSeats() {
        SeatManagerTests.reserveAndUnreserveFromTwoSeats(new PriorityQueueSeatManager(2));
    }

    @Test
    public void reserveAndUnreserveFromTenSeats() {
        SeatManagerTests.reserveAndUnreserveFromTenSeats(new PriorityQueueSeatManager(10));
    }
}