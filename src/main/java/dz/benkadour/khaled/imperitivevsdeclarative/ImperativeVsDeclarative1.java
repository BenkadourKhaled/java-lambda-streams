package dz.benkadour.khaled.imperitivevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative1 {

    public static void main(String[] args) {

        /*
        * Imperative - How style of programming
        * */

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum using imperative Approach " + sum);

        /*
        * Declarative Style of programming - What style of programming
        * */

        int sum1 = IntStream.rangeClosed(0, 100)
                .sum();
        System.out.println("Sum using Declarative Approach " + sum);

    }

}
