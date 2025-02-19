package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

// Take an array of words and concatenate them into a single string using StringBuilder.

class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[]{"This", "is", "the", "best", "and", "most", "detailed", "course", "on", "java,", "on", "internet"};

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);


    }
}
