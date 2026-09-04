package week_4_problems.class_problems;

class FeeAccount {
    void payGo() {
        System.out.println("Paid in one go (day-scholar account)");
    }
}

class HostelFeeAccount extends FeeAccount {
    void payInstallments() {
        System.out.println("Paid in two installments (hostel account)");
    }
}

public class BatchPayments {
    static int hostelCount = 0;
    static int dayScholarCount = 0;

    public static void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            ((HostelFeeAccount) account).payInstallments();
            hostelCount++;
        } else {
            account.payGo();
            dayScholarCount++;
        }
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
                new HostelFeeAccount(), new HostelFeeAccount(),
                new FeeAccount(), new FeeAccount()
        };
        double amount = 60000;

        for (FeeAccount acc : accounts) {
            processPayment(acc, amount);
        }

        System.out.println("Hostel accounts processed: " + hostelCount + " | Day-scholar accounts processed: " + dayScholarCount);
    }
}