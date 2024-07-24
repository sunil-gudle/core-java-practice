package src.programmingChallenges.exceptionHandling;

// Define custom exceptions
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

class MyCustomRuntimeException extends RuntimeException {
    public MyCustomRuntimeException(String message) {
        super(message);
    }
}

public class CustomExceptionTest {
    public static void main(String[] args) {
        // Handle checked exception
        try {
            methodWithCheckedException();
        } catch (MyCustomException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Handle unchecked exception
        try {
            methodWithUncheckedException();
        } catch (MyCustomRuntimeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }

    // Method that throws a checked exception
    public static void methodWithCheckedException() throws MyCustomException {
        boolean errorOccurred = true; // Simulate an error
        if (errorOccurred) {
            throw new MyCustomException("Checked exception occurred!");
        }else {
            System.out.println("No exception");
        }
    }

    // Method that throws an unchecked exception
    public static void methodWithUncheckedException() {
        boolean errorOccurred = true; // Simulate an error
        if (errorOccurred) {
            throw new MyCustomRuntimeException("Unchecked exception occurred!");
        }
    }
}

