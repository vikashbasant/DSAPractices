package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {23,1,2,45,56, 6,78, 98};

        Integer i = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(i);
    }
}
