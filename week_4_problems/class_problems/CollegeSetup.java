package week_4_problems.class_problems;

class SrmStudent {
    static String collegeName;
    static String academicYear;
    String name;

    static {
        collegeName = "SRM";
        academicYear = "2024-2025";
        System.out.println("College info loaded");
    }

    public SrmStudent(String name) {
        this.name = name;
    }
}

public class CollegeSetup {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};

        for (String name : names) {
            SrmStudent student = new SrmStudent(name);
            System.out.println("Student record created: " + student.name);
        }
    }
}