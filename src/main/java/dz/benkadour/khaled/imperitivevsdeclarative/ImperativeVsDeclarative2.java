package dz.benkadour.khaled.imperitivevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

        /*
        * Imperative
        * */

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println("uniqueList : " + uniqueList);

        /*
         * Imperative
         * */


        List<Integer> uniqueList2 = integerList.stream()
                .distinct()
                .toList();
        System.out.println("uniqueList : " + uniqueList2);

    }

}
