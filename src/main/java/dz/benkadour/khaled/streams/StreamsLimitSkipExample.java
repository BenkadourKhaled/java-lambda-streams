package dz.benkadour.khaled.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream().limit(3).reduce(Integer::sum);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> limit = limit(integers);
        System.out.println(limit.get());
    }

}
