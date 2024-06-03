package gr.aueb.cf.ch12;


import gr.aueb.cf.ch12.model.Student;

/**
*Like a clint
* 1. Creates an {@link Student} instance (alice)
* 2. Invoke public methods (setters / getters)
*
* @author a8ana
*
* */

public class StudentMain {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "D.");

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W");

        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname " + alice.getLastname());









        //set
//         alice.id = 1;
//         alice.firstname = "Alice";
//         alice.lastname = "Wonderland";



         //get
//        System.out.println("Id: " + alice.id);
//        System.out.println("Firstname: " + alice.firstname);
//        System.out.println("Lastname " + alice.lastname);
    }
}
