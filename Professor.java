import java.util.ArrayList;

public class Professor extends Person {
    private String department;
    private double salary;
    private ArrayList<Student> advisees;

    public Professor(String firstName, String lastName, int id, String department, double salary) {
        super(firstName, lastName, id);
        this.department = department;
        this.salary = salary;
        advisees = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public ArrayList<Student> getAdvisees() {
        return advisees;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addAdvisee(Student student) {
        advisees.add(student);
    }

    public boolean removeAdvisee(int id) {
        for (Student student : advisees) {
            if (student.getId() == id) {
                advisees.remove(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
        // Call the display method from the Person class to show name and ID
        super.display();
        // Add additional details specific to the Professor class
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
        System.out.println("Advisees:");
        for (Student advisee : advisees) {
            System.out.println(
                    "\t" + advisee.getFirstName() + " " + advisee.getLastName() + " (ID: " + advisee.getId() + ")");
        }
    }
}