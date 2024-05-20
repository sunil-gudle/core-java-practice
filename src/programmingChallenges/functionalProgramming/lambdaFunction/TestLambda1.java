package src.programmingChallenges.functionalProgramming.lambdaFunction;

interface FuncInterface {
    void abstractFun(int x);

    default void normalFun() {
        System.out.println("Hello");
    }
}

public class TestLambda1 {
    public static void main(String[] args) {
        FuncInterface funcInterface = (x) -> System.out.println(2 * x);

        funcInterface.abstractFun(5);
        funcInterface.normalFun();
    }
}
