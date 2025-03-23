
public class Person {
    // private Attributes
    private String firstName;
    private String lastName;
    private int id;
   
    //constructor
    public Person(String firstName, String lastName, int id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    }

    //getter for firstname
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID: " + id);
    }
 }
  
