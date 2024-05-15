package src.programmingChallenges.abstractionAndPolymorphism;

abstract class CalculateArea {

    String color;
    abstract double area();
public abstract String toString();

    public CalculateArea(String color) {
        System.out.println("Shape constructor is called...");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class CircleName extends CalculateArea{


    public CircleName(String color) {
        super(color);
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}


