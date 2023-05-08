package object_oriented_programming;

// A class encapsulates attributes and methods together
// A class is a blueprint for creating objects
// In one java file it can only contain one public class, we cant declare more than one public class
// The default access modifier is public


// new class declaration
class Student {

    // attributes of the class
    String name;
    int rollNo;
    int fees;

    // methods of the class
    public void printDetails(){
        System.out.println("\nStudent's Name   : "+name);
        System.out.println("Student's RollNo : "+rollNo);
    }

    public int getFees(){
        return fees;
    }

}

public class Classes {
    public static void main(String[] args) {

        // object declaration and initialization
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();

        // attribute instantiation
        stu1.name = "Binayak Purohit";
        stu1.rollNo = 580;
        stu1.fees = 34;
        
        stu2.name = "Needhisha";
        stu2.rollNo = 520;
        stu2.fees = 18;
        
        stu3.name = "Lavanya Debbadi";
        stu3.rollNo = 543;
        stu3.fees = 29;

        // method call
        stu1.printDetails();
        int s1Fees = stu1.getFees();
        System.out.println("Fees = "+s1Fees+"k");

        stu3.printDetails();
        int s3Fees = stu3.getFees();
        System.out.println("Fees = "+s3Fees+"k");

        stu2.printDetails();
        int s2Fees = stu2.getFees();
        System.out.println("Fees = "+s2Fees+"k");

    }
}
