//    A class to represent a Student
public class Student {
//Attributes  of a student
    int rollNo;
    String name, adress;

//    Constructor
    public Student(int rollNo, String name, String adress) {
//        This keyword refers to current instance itself
        this.rollNo = rollNo;
        this.name = name;
        this.adress = adress;
    }

    @Override
//    Method of Student class to print student details in main()

    public String toString() {
//        Returning attributes of Student
        return this.rollNo + " " + this.name + " " + this.adress;
    }
}


