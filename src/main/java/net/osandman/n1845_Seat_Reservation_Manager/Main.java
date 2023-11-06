package net.osandman.n1845_Seat_Reservation_Manager;

public class Main {
    public static void main(String[] args) {
        test1(new SeatManager(10));
        test2(new SeatManager(2));
        test1(new SeatManagerPriorityQueue(10));
        test2(new SeatManagerPriorityQueue(2));
    }

    private static void test1(ISeatManager seatManager) {
        System.out.println(seatManager.reserve());  // 1
        System.out.println(seatManager.reserve());  // 2
        System.out.println(seatManager.reserve());  // 3
        seatManager.unreserve(2);
        System.out.println(seatManager.reserve());  // 2
        System.out.println(seatManager.reserve());  // 4
        System.out.println(seatManager.reserve());  // 5
        seatManager.unreserve(1);
        System.out.println(seatManager.reserve());  // 1
        System.out.println(seatManager.reserve());  // 6
        System.out.println(seatManager.reserve());  // 7
        System.out.println();
    }
    private static void test2(ISeatManager seatManager) {
        System.out.println(seatManager.reserve());
        seatManager.unreserve(1);
        System.out.println(seatManager.reserve());
        System.out.println(seatManager.reserve());
        seatManager.unreserve(2);
        System.out.println(seatManager.reserve());
        seatManager.unreserve(1);
        System.out.println(seatManager.reserve());
        seatManager.unreserve(2);
        System.out.println(seatManager.reserve());
        System.out.println();
    }
}
