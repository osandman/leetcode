package net.osandman.n1845_Seat_Reservation_Manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeatManagerTests {
    public static void reserveThreeFromTenSeats(SeatManager seatManager) {
        assertEquals(1, seatManager.reserve());
        assertEquals(2, seatManager.reserve());
        assertEquals(3, seatManager.reserve());
    }

    public static void reserveAndUnreserveFromTwoSeats(SeatManager seatManager) {
        assertEquals(1, seatManager.reserve());
        seatManager.unreserve(1);
        assertEquals(1, seatManager.reserve());
        assertEquals(2, seatManager.reserve());
        seatManager.unreserve(2);
        assertEquals(2, seatManager.reserve());
        seatManager.unreserve(1);
        assertEquals(1, seatManager.reserve());
        seatManager.unreserve(2);
        assertEquals(2, seatManager.reserve());
    }

    public static void reserveAndUnreserveFromTenSeats(SeatManager seatManager) {
        assertEquals(1, seatManager.reserve());  // 1
        assertEquals(2, seatManager.reserve());  // 2
        assertEquals(3, seatManager.reserve());  // 3
        seatManager.unreserve(2);
        assertEquals(2, seatManager.reserve());  // 2
        assertEquals(4, seatManager.reserve());  // 4
        assertEquals(5, seatManager.reserve());  // 5
        seatManager.unreserve(1);
        assertEquals(1, seatManager.reserve());  // 1
        assertEquals(6, seatManager.reserve());  // 6
        assertEquals(7, seatManager.reserve());  // 7
    }
}
