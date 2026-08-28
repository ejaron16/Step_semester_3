package oop_classes_objects.class_problems;

public class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    PlacementRecord(String name, String  comp, double pack){
        studentName = name;
        company = comp;
        packageLpa = pack;
    }
    void printRecord(){
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA ");
    }

    public static void main(String[] args){
        PlacementRecord[] r = new PlacementRecord[3];
        r[0] = new PlacementRecord("Ravi","TCS",4.5);
        r[1] = new PlacementRecord("Anitha","Zoho",6.2);
        r[2] = new PlacementRecord("Karthik","Infosys",4.0);

        for(int i=0; i<r.length;i++){
            r[i].printRecord();
        }
    }
}
