package dz.benkadour.khaled.streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream().reduce(0, (x, y) -> x > y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 4, 3, 14, 7, 18, 90, 10);

        Optional<Integer> maxValue = Optional.of(findMaxValue(integerList));
        if (maxValue.isPresent()) {
            System.out.println("Max Value Using Optional : " + maxValue.get());
        }
    }

}
