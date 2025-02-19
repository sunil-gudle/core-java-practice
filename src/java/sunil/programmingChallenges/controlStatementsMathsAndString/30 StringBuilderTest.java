package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("My name is ");
        sb.append("Sunil ");
        sb.append("and my age is ");
        sb.append(27);
        // by default it uses toString() method
        System.out.println(sb);

        // this way it will get printed
        String result = sb.toString();
        System.out.println(result);
    }
}
