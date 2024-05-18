package src.programmingChallenges.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class TestingStreamAndFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Mango", "PineApple");
        System.out.println(fruits.size());

        System.out.println("\nPrinting fruits normally");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        System.out.println("\nPrinting fruits with Stream");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.print(fruit + " ");
            }
        });

        System.out.println("\nPrinting fruits with Stream and Lambda Expression");
        fruits.stream().forEach(fruit -> System.out.print(fruit+ " "));

        System.out.println("\nPrinting fruits with filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.print(fruit + " "));
    }

}
