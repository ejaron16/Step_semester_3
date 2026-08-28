package oop_classes_objects.class_problems;

public class Student {
    String name;
    int att;

    static String clgName = "SRM IST";
    static int stuc = 0;

    Student(String n, int a){
        name=n;
        att=a;
        stuc++;
    }
    static void printclginfo(){
        System.out.println(clgName);
        System.out.println("Students Created : "+stuc);
    }

    public static void main(String[] args){
        Student s1 = new Student("Alice",85);
        Student s2 = new Student("Bob",92);

        Student.printclginfo();
    }
}
