

public class TestProfessor {
    public static void main(String[] args) {
        System.out.println("****** Testing Professor ******");

        // Create Student objects
        Student s1 = new Student("Niklaus", "Mikealson", 11111, "DS", 3.9, 120);
        Student s2 = new Student("Elijah", "Mikealson", 22222, "CS", 3.8, 100);
        Student s3 = new Student("Rebekkah", "Mikealson", 33333, "BS", 3.7, 90);
        Student s4 = new Student("Freya", "Mikealson", 44444, "BA", 3.6, 80);

        //Create Professor object
        Professor p1 = new Professor("Marcos", "Mikealson", 234, "DS", 80000);

            // Display professor details
        p1.display();

        // Display department and salary
        System.out.println("Department: " + p1.getDepartment());
        System.out.print("Salary: " + p1.getSalary());

        // Update department and salary
        p1.setDepartment("Math");
        p1.setSalary(30000);

        System.out.println("\nUpdated Department: " + p1.getDepartment());
        System.out.print("Updated Salary: " + p1.getSalary());

             // Add advisees
        p1.addAdvisee(s1);
        p1.addAdvisee(s2);
        p1.addAdvisee(s3);
        p1.addAdvisee(s4);

        // Display advisees
        System.out.println("\nAdvisees:");
        for (Student advisee : p1.getAdvisees()) {
            System.out.println("\t" + advisee.getFirstName() + " " + advisee.getLastName() + " (ID: " + advisee.getId() + ")");
        }

        //remove an advisee
        if (p1.removeAdvisee(44444)) {
            System.out.println("Advisee with ID 44444 has been removed.");
        } 

        // Display advisees after removal
        System.out.println("\nAdvisees after removal:");
        for (Student advisee : p1.getAdvisees()) {
            System.out.println("\t" + advisee.getFirstName() + " " + advisee.getLastName() + " (ID: " + advisee.getId() + ")");
        }
    }
}