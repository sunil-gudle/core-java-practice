package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

// Create an object with final fields and a constructor to initialize them.

// we can call it as a immutable class
class FinalFields {
    final int noOfWheels;
    final String model;
    final String engineInLitre;

    public FinalFields(int noOfWheels, String model, String engineInLitre) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLitre = engineInLitre;
    }
}
