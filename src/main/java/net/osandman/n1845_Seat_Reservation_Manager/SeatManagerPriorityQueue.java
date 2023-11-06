package net.osandman.n1845_Seat_Reservation_Manager;

import java.util.PriorityQueue;

public class SeatManagerPriorityQueue implements ISeatManager {
    PriorityQueue<Integer> seats;
    public SeatManagerPriorityQueue(int n) {
        seats = new PriorityQueue<>(n);
        for (int i = 1; i <= n; i++) {
            seats.offer(i);
        }
    }

    @Override
    public int reserve() {
        return seats.poll();
    }

    @Override
    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}
