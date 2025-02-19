package src.java.sunil.programmingChallenges.javaBasics;
public class Variables {
    // Declared Instance Variable
    public String geek;
    public int i;
    public Integer I;
    public Variables() {
        // Default Constructor
        // initializing Instance Variable
        this.geek = "Sunil Gudle";
    }
    // Declared static variable
    public static String user = "Sunil Gudle";

    public static void main(String[] args) {
        // Declared a Local Variable
        int var = 10;
        // This variable is local to this main method only
        System.out.println("Local Variable: " + var);

        // Object Creation to use instance variables
        Variables name = new Variables();

        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for instance variable of type int is "
                + name.i);

        // toString() called internally
        System.out.println("Default value for instance variable of type Integer is "
                + name.I);

        // user variable(static) can be accessed without object
        // creation Displaying O/P Variables.user --> using the static variable
        System.out.println("Static Geek Name is : " + Variables.user);

    }

}
