package oop_classes_objects.class_problems;

public class IdCard {
    String name;
    int bi;

    IdCard(String n, int b){
        name=n;
        bi=b;
    }

    public static void main(String[] args){
        IdCard ravi = new IdCard("Ravi",0);

        IdCard dup = ravi;
        dup.bi=3;

        System.out.println("Ravi's Books Issued [first var] : "+ravi.bi);
        System.out.println("Duplicate == Ravi : "+(dup==ravi));

        IdCard sep = new IdCard("Ravi",3);
        System.out.println("Seperate  == Ravi : "+(sep == ravi));
    }
}
