import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        System.out.println("**** Testing Student. ***");
        Student s1 = new Student("Diya", "Patel", 12345, "DS", 3.2, 120);
        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Java");
        s1.addCourse("Calculus");
        s1.addCourse("Statistics");

        s1.display();

        System.out.println("Credits: " + s1.getCredits());
        System.out.println("GPA: " + s1.getGPA());
        System.out.println("Major: " + s1.getMajor());
        System.out.println("Transfer: " + s1.isTransfer());

        //update student details
        s1.setCredits(0);
        s1.setGPA(0);
        s1.setMajor("Math");

        System.out.println("Updated Credits: " + s1.getCredits());
        System.out.println("Updated GPA: " + s1.getGPA());
        System.out.println("Updated Major: " + s1.getMajor());

        if (s1.dropCourse("Calculus")) {
            System.out.println("the class has been dropped");
        }

        ArrayList<String> enrolledCourses = s1.getEnrolledCourses();
        System.out.println("You are enrolled in the following courses:");
        for (String course : enrolledCourses) {
            System.out.println(course);
        }
        
        }
    }
