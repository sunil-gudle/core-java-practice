package src.java.sunil.orgsLevelPrograms;
import java.util.*;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
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

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 45000));
        employees.add(new Employee("Emma", 70000));

        // Sort employees by salary
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));

        // Print sorted list
        System.out.println("Employees sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}