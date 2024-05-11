package src.programmingChallenges.collections;

// Write a method concatenate Strings that takes variable arguments of String type and concatenates them into a single string.

class VarArgs {

    public static void main(String[] args) {
        String str1 = concatenate("Sunil", "Ramesh", "Suresh");
        System.out.println(str1);
        System.out.println(concatenate("Java", "Spring Boot", "Hibernate"));
    }
    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

}