package oop_classes_objects.class_problems;

public class Course {
    String c, t;
    int cr, lc;

    public Course(String pc, String pt, int pcr, int plc){
        c = pc;
        t = pt;
        cr = pcr;
        lc = plc;
    }
    public Course(String c, String t, int cr){
        this(c, t, cr, 0);
    }
    public int totalcredits(){
        return cr + lc;
    }

    public static void main(String[] args){
        Course thc = new Course("21CSC201J ", "Data Structures", 4);
        System.out.println(thc.c + "Total Credits : "+thc.totalcredits());

        Course lco = new Course("21CSC205L ", "DSA Lab", 3, 1);
        System.out.println(lco.c + "Total Credits " + lco.totalcredits());
    }
}
