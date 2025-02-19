package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;


//Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.

class ConcatAndConvert {
    public static void main(String[] args) {

        String firstName = "Sunil";
        String lastName = "Gudle";

        String fullName = firstName + " "+ lastName;
        String fullName1 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName1.toUpperCase());
    }
}
