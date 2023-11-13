package net.osandman.n1845_Seat_Reservation_Manager;

public class ArraySeatManager implements SeatManager {
    private final boolean[] seats;
    private int minReserveIndex = 0;

    public ArraySeatManager(int n) {
        seats = new boolean[n];
    }

    @Override
    public int reserve() {
        int result = minReserveIndex + 1;
        seats[minReserveIndex] = true;
        for (int i = minReserveIndex + 1; i < seats.length; i++) {
            if (!seats[i]) {
                minReserveIndex = i;
                return result;
            }
        }
        minReserveIndex = seats.length;
        return result;
    }

    @Override
    public void unreserve(int seatNumber) {
        seats[seatNumber - 1] = false;
        minReserveIndex = Math.min(minReserveIndex, seatNumber - 1);
    }
}
