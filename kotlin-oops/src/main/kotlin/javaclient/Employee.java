package javaclient;

public class Employee {

    private final String firstName;

    public Employee(String firstName){
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
