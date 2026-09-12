package week_5_problems.class_problems;

class CineScreen {
    private int seatsTotal;
    private int seatsAvailable;

    public CineScreen(int total) {
        if (total <= 0) {
            System.out.println("construction rejected");
            this.seatsTotal = 0;
            this.seatsAvailable = 0;
        } else {
            this.seatsTotal = total;
            this.seatsAvailable = total;
        }
    }

    public void bookSeat() {
        if (this.seatsAvailable > 0) {
            this.seatsAvailable = this.seatsAvailable - 1;
        }
    }

    public void cancelBooking() {
        if (this.seatsAvailable < this.seatsTotal) {
            this.seatsAvailable = this.seatsAvailable + 1;
        }
    }

    public int getSeatsAvailable() {
        return this.seatsAvailable;
    }
}

 class Main3 {
    public static void main(String[] args) {
        new CineScreen(0);

        CineScreen screen = new CineScreen(2);
        screen.bookSeat();
        screen.bookSeat();
        screen.bookSeat();
        System.out.println(screen.getSeatsAvailable());

        screen.cancelBooking();
        screen.cancelBooking();
        screen.cancelBooking();
        System.out.println(screen.getSeatsAvailable());
    }
}
