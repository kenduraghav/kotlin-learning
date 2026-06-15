package javaclient;

import oops.Employee;
import oops.MyUser;

public class JavaClient {

    public static void main(String[] args) {

        new Employee("Nick").sayHi();

        MyUser.create("Kotlin User").greet();
    }
}
