package oop_classes_objects.assignment_problems;

public class PayrollAccount {
    private double basicSal, bonus;

    public PayrollAccount(double basicSal) {
        if(basicSal<0){
            basicSal=0;
            System.out.println("Basic Salary Negative. Resetting to 0");
        } else {
            this.basicSal = basicSal;
        }
    }
    public void creditBonus(double amt){
        if (amt<=0){
            System.out.println("Credit Bonus = 0");
        } else {
            bonus+=amt;
            System.out.println("Bonus Credited : Rs "+amt);
        }
    }
    public void deductTax(double per){
        if(per>=0 && per<=100){
            basicSal -= (basicSal* (per /100.0));
            System.out.println("Tax Deducted : "+per+" % ");
        }
    }
    public double getNetSalary(){
        return basicSal+bonus;
    }

    public static void main(String[] args) {
        PayrollAccount pa = new PayrollAccount(50000);
        pa.creditBonus(5000);
        pa.deductTax(10);
        System.out.println("Net Salary : Rs "+pa.getNetSalary());
    }
}
