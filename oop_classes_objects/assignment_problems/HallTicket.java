package oop_classes_objects.assignment_problems;

public class HallTicket {
    String studentName;
    int seatNumber;

    HallTicket(String name, int seat) {
        studentName = name;
        seatNumber = seat;
    }

    public static void main(String[] args) {
        HallTicket priya = new HallTicket("Priya", 0);

        HallTicket copy = priya;
        copy.seatNumber = 45;

        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));

        HallTicket separate = new HallTicket("Priya", 45);
        System.out.println("separate == priya: " + (separate == priya));
    }
}
