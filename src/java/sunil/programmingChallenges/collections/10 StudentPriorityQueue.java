package src.java.sunil.programmingChallenges.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// Create a PriorityQueue of a custom class Student with attributes name and grade. Use a comparator to order by grade.

class StudentPriorityQueue {

    public static void main(String[] args) {
        Queue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Sunil", 'B'));
        queue.offer(new Student("Ramesh", 'A'));
        queue.offer(new Student("Suresh", 'C'));
        queue.offer(new Student("Ram", 'D'));
        queue.offer(new Student("Shyam", 'A'));

        System.out.printf("Queue is: %s\n", queue);
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }

    private static class Student {
        private final String name;
        private final char grade;

        private Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
}
