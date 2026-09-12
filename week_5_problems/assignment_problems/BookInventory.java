package week_5_problems.assignment_problems;

class BookInventory {
    private int copiesTotal;
    private int copiesAvailable;

    public BookInventory(int total) {
        if (total <= 0) {
            this.copiesTotal = 0;
            this.copiesAvailable = 0;
        } else {
            this.copiesTotal = total;
            this.copiesAvailable = total;
        }
    }

    public void checkOut() {
        if (this.copiesAvailable > 0) {
            this.copiesAvailable = this.copiesAvailable - 1;
        }
    }

    public void checkIn() {
        if (this.copiesAvailable < this.copiesTotal) {
            this.copiesAvailable = this.copiesAvailable + 1;
        }
    }

    public int getCopiesAvailable() {
        return this.copiesAvailable;
    }
}

class Main3 {
    public static void main(String[] args) {
        BookInventory b = new BookInventory(3);
        b.checkOut();
        b.checkOut();
        b.checkOut();
        b.checkOut();
        System.out.println(b.getCopiesAvailable());

        b.checkIn();
        b.checkIn();
        b.checkIn();
        b.checkIn();
        System.out.println(b.getCopiesAvailable());
    }
}
