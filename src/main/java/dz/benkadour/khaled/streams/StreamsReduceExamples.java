package dz.benkadour.khaled.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExamples {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce(1, (a, b) -> (a * b));
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce((a, b) -> (a * b));
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMultiplication(integers));
        System.out.println("***************************");
        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());
    }

}
