public class TestPerson {
    public static void main(String[] args) {
        //create a person object

        Person person = new Person("Diya", "Patel", 12345);
        //Test getter nd print output
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getId());

        person.display();
    

    }
}