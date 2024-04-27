package src.programmingChallenges.encapsulationAndInheritance.example3;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Sunil", 27, 2878368);
        System.out.println(employee.getEmployeeDetails());
        employee.setName("Sunil Gudle");
        System.out.println(employee.getEmployeeDetails());
    }
}
