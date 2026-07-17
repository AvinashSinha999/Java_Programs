package J18_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class CFL11_ArrayList_Class_Element {
    public static void main(String[] args) {

        CFL11_Student s1 = new CFL11_Student("Amit", "1");
        CFL11_Student s2 = new CFL11_Student("Ritwik", "2");
        CFL11_Student s3 = new CFL11_Student("Shubham", "3");

        List<CFL11_Student> myStudents = new ArrayList();
        // List<CFL10_Student> myStudents = new LinkedList();         // Any class under the List Interface is possible
        // List<CFL10_Student> myStudents = new Vector();             // Any class under the List Interface is possible
        // List<CFL10_Student> myStudents = new Stack<>();            // Any class under the List Interface is possible

        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println("\nStudent List    : " + myStudents);

        s1.printDetail();
        s2.printDetail();
        s3.printDetail();

        /*
            OUTPUT :
                    Student List    : [CFL10_Student{name='Amit', rollNo='1'}, CFL10_Student{name='Ritwik', rollNo='2'}, CFL10_Student{name='Shubham', rollNo='3'}]
                    Student Name    : Amit
                    Student Roll No : 1
                    Student Name    : Ritwik
                    Student Roll No : 2
                    Student Name    : Shubham
                    Student Roll No : 3
        */

    }
}