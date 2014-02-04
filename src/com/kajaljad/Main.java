package com.kajaljad;

public class Main {

    void prettyPrint(Person p) {
        System.out.println("Main Person: " + p);
    }

    void prettyPrint(Employee e) {
        System.out.println("Main Employee: " + e);
    }

    public static void main(String[] args) {
        final Person p = new Person();
        final Employee e = new Employee();
        final Person pe = new Employee();

        final Main main = new Main();
        main.prettyPrint(p);
        main.prettyPrint(e);
        main.prettyPrint(pe);

        final PersonPrinter personPrinter = new PersonPrinter();
        personPrinter.print(p);
        personPrinter.print(e);
        personPrinter.print(pe);

        final EmployeePrinter employeePrinter = new EmployeePrinter();
        employeePrinter.print(p);
        employeePrinter.print(e);
        employeePrinter.print(pe);

        final PersonPrinter personEmployeePrinter = new EmployeePrinter();
        personEmployeePrinter.print(p);
        personEmployeePrinter.print(e);
        personEmployeePrinter.print(pe);

        main.prettyPrint(null);
    }
}

class Person {
    public String toString() {
        return "I am a Person";
    }
}

class Employee extends Person {
    public String toString() {
        return "I am an Employee";
    }
}

class PersonPrinter {
    public void print(Person p) {
        System.out.println("Person Printer: " + p);
    }
}

class EmployeePrinter extends PersonPrinter {
    public void print(Employee p) {
        System.out.println("Employee Printer: " + p);
    }
}