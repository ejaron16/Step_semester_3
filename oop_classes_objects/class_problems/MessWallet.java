package oop_classes_objects.class_problems;

import java.sql.SQLOutput;

public class MessWallet {
    private double bal;

    public MessWallet(double openbal) {

        if (openbal < 0) {
            System.out.println("Warning : Negative Balance. Setting to Zero");
            bal = 0;
        } else {
            bal = openbal;
        }
    }
    public void topup(double amt){
        if(amt <= 0) {
            System.out.println("Invalid Amount");
        } else{
            bal+=amt;
            System.out.println("Balance After Top-Up : "+bal);
        }
    }
    public void deduct(double amt){
        if(amt > bal){
            System.out.println("Insufficient Balance");
        } else{
            bal-=amt;
        }
    }
    public double getBal(){
        return bal;
    }

    public static void main(String[] args){
        MessWallet mw = new MessWallet(500);
        mw.topup(200);
        mw.deduct(1000);
        System.out.println("Final Balance : "+ mw.getBal());
    }
}
