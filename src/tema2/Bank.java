package tema2;

public class Bank {
    public String name;
    Bank(String name){this.name=name;}
}

class Employee{
    public String name;
    Employee(String name){this.name=name;}
}

class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        Employee emp = new Employee("Neha");
        System.out.println(emp.name + " is an employee of " + bank.name);
    }
}

