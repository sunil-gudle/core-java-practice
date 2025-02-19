package src.java.sunil.programmingChallenges.functionalProgramming.IntermediateMethods.Example2;

import java.util.List;

// Create a list of employees with name and salary fields. Write a comparator that sorts the employees by salary.
// Then, use this comparator to sort your list using the sort stream operation.

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Sunil", 2),
                new Employee("Shyam", 5),
                new Employee("Ram", 3),
                new Employee("Ramesh", 9),
                new Employee("Suresh", 6),
                new Employee("Karan", 7),
                new Employee("Rushi", 1)
        );

        employees.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
