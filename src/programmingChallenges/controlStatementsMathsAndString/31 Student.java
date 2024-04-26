package src.programmingChallenges.controlStatementsMathsAndString;

// Define a Student class with fields like name and age, and use toString to print student details.

class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Student values = new Student("Sunil", 27);
        System.out.println(values);
    }
}
