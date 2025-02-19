package src.java.sunil.programmingChallenges.functionalProgramming.IntermediateMethods.Example2;

// Create a list of employees with name and salary fields. Write a comparator that sorts the employees by salary.
// Then, use this comparator to sort your list using the sort stream operation.

public class Employee {
    private final String name;
     private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
