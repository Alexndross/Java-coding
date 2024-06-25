package gr.aueb.cf.ch15.person;

public class Main {

    public static void main(String[] args) {
        Employee alice = new Employee(1, "Alice", "W.", 1000D);

        alice.work();
        alice.speak();

        System.out.println("Firstname: " + alice.getFirstname() + "Lastaname: "
        + alice.getLastname() + " Salary: " + alice.getSalary());
    }
}
