package src.programmingChallenges.encapsulationAndInheritance.example2;

// Define a BankAccount class with private attributes like accountNumber, accountHolderName, and balance.
// Provide public methods to deposit and withdraw money, ensuring that these methods don't allow illegal operations like withdrawing
// more money than the current balance.

public class Customer {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("001", "Sunil");
        bankAccount.depositMoney(500);
        System.out.println(bankAccount.withdrawMoney(600));
        bankAccount.depositMoney(-50);
        bankAccount.withdrawMoney(-50);

    }
}
