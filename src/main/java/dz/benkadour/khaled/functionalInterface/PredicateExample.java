package dz.benkadour.khaled.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> predicate = (i) -> {
            return (i % 2 == 0);
        };

        System.out.println(predicate.test(4));

        Predicate<Integer> predicate2 = (i) -> (i % 2 == 0);
        System.out.println(predicate2.test(4));

    }

}
