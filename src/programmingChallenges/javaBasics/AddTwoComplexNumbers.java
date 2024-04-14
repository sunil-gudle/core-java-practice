//Java Program to Add two Complex Numbers
/*Ex: Suppose we have two complex numbers:
(3 + 2i) --- (1)
(2 + 5i) --- (2)
To add these two complex numbers, we will add the real and imaginary parts separately:
Real part = 3 + 2 = 5
Imaginary part = 2 + 5 = 7
Therefore, the sum of the two complex numbers is:
(5 + 7i)  */

package src.programmingChallenges.javaBasics;

public class AddTwoComplexNumbers {
    // real and imaginary components of the complex integer are stored in variables.
    int real, imag;

    // The constructor is a method that is used to create instances of complex numbers with specific values assigned to the real and imaginary parts.
    public AddTwoComplexNumbers(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    //Display the complex number in the form of (a + bi)
    public void showC() {
        System.out.print("(" + this.real + " + " + this.imag + "i" + ")");
    }

    // Addition of two complex numbers
    public static AddTwoComplexNumbers add(AddTwoComplexNumbers n1, AddTwoComplexNumbers n2) {

        // Creating a new variable to store the result
        AddTwoComplexNumbers res = new AddTwoComplexNumbers(0, 0);

        // To perform addition of two complex numbers, the real parts of each number are added together.
        res.real = n1.real + n2.real;

        // Adding imaginary parts of both complex numbers
        res.imag = n1.imag + n2.imag;

        // Returning the result
        return res;
    }

    public static void main(String arg[]) {

        // Creating two complex numbers
        AddTwoComplexNumbers c1 = new AddTwoComplexNumbers(4, 5);
        AddTwoComplexNumbers c2 = new AddTwoComplexNumbers(10, 5);

        // Printing the complex numbers
        System.out.print("First Complex number: ");
        c1.showC();
        System.out.print("\nSecond Complex number: ");
        c2.showC();

        // Calling add() to perform addition
        AddTwoComplexNumbers res = add(c1, c2);

        // Displaying the addition
        System.out.println("\nAddition is :");
        res.showC();
    }
}
