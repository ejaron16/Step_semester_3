package week_2_problems.class_problems;

public class StudentParser {
    public static void main(String[] args) {
        parseStudentRecord("Ananya Verma, RA2511003010123,CSE");
        parseStudentRecord("Ananya Verma,CSE");
    }

    public static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length == 3) {
            System.out.println("Name: " + fields[0].trim() +
                    " | Roll No: " + fields[1].trim() +
                    " | Dept: " + fields[2].trim());
        } else {
            System.out.println("Invalid Record");
        }
    }
}