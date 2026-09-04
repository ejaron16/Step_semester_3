package week_4_problems.assignment_problems;

class Payment {
    void pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
    }
}

class CardPayment extends Payment {
    void payWithProcessingFee(double amount) {
        double total = amount + (amount * 0.02);
        System.out.println("Charged (card, incl. fee): Rs " + total);
    }
}

public class CanteenPOS {
    static double totalCollected = 0;

    public static void processTransaction(Payment payment, double amount) {
        if (payment instanceof CardPayment) {
            CardPayment cp = (CardPayment) payment;
            cp.payWithProcessingFee(amount);
            totalCollected += amount + (amount * 0.02);
        } else {
            payment.pay(amount);
            totalCollected += amount;
        }
    }

    public static void main(String[] args) {
        Payment[] payments = {
                new CardPayment(), new Payment(), new CardPayment(),
                new Payment(), new CardPayment()
        };
        double[] amounts = {100, 50, 200, 75, 120};

        for (int i = 0; i < payments.length; i++) {
            processTransaction(payments[i], amounts[i]);
        }

        System.out.println("Total Collected: Rs " + totalCollected);
    }
}