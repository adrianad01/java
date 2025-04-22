package lambda;

import java.util.Comparator;

public class LambdaExamples {

    public static void main(String[] args) {

        LambdaInterface lambda = () -> System.out.println("Hello Lambda");

        lambda.apply();
    }
}
