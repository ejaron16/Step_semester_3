package oop_classes_objects.assignment_problems;

public class BookInventory {
    String title, author;
    int coavail;

    public BookInventory(String author, String title, int coavail) {
        this.coavail = coavail;
        this.author = author;
        this.title = title;
    }

    public void printEntry(){
        System.out.println(title + " by " +author+ " - " +coavail+" copies available");
    }

    public static void main(String[] args) {
        BookInventory[] b = new BookInventory[4];
        b[0] = new BookInventory("Clean Code", "Robert C. Martin", 3);
        b[1] = new BookInventory("Effective Java", "Joshua Bloch", 5);
        b[2] = new BookInventory("Refactoring", "Martin Fowler", 0);
        b[3] = new BookInventory("Design Patterns", "GoF", 2);

        for(int i=0; i<b.length;i++){
            b[i].printEntry();
        }
    }
}
