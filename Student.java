import java.util.ArrayList;

public class Student extends Person {
    
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;

    //Constructor for Student class
    public Student(String firstName, String lastName, int id, String major, double gpa, int credits) {
        super(firstName, lastName, id); // Call to the superclass constructor
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
        this.transfer = false;
       balance = 0; // Initialize balance to 0
        enrolledCourses = new ArrayList<>(); // Initialize the enrolledCourses list
    } //end constructor

    public String getMajor() {
        return major;
    }

    public double getGPA() {
        return gpa;
    }
    public int getCredits() {
        return credits;
    }
    //check if student is a transfer student
    public boolean isTransfer() {
        return transfer;
    }
    //gets cuurent balance 
    public double getBalance() {
        return balance;
    }
    //get list of courses tsudent is enrolled in 
    public ArrayList<String> getEnrolledCourses(){
        return enrolledCourses;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void setGPA(int gpa) {
        this.gpa = gpa;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //Adds the provided course to the ArrayList
    public void addCourse(String course) {
        enrolledCourses.add(course);
    }

    //Removes provided voirse from the Arraylist
    //if the course exists in list, it is removed and method returns true
    //if course do not exist in list the method returns false
    public boolean dropCourse(String course) {
        return enrolledCourses.remove(course);
    }
    //display student/s info by calling display() method from person class
    //Also displays student/s major, gpa, credits and enrolled courses

    public void display() {
        super.display(); //call display method from person class so we dont have to write it again
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Credits: " + credits);
        System.out.println("Enrolledcourses: " + enrolledCourses);
    }
}