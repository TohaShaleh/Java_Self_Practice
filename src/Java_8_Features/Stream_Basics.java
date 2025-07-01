package Java_8_Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Stream_Basics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 5, 2, 10, 3, 8, 7, 6);


        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);


        // Map: Square each numbers
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);


        // Remove duplicates
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinctNumbers);


        // Sort the numbers ascending
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);


        // Sort the numbers in descending order
        List<Integer> sortedDescending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted numbers (descending): " + sortedDescending);


        // Skip first 3 elements
        List<Integer> skipped = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("After skipping first 3: " + skipped);


        // 6.Take first 4 elements
        List<Integer> limited = numbers.stream()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("First 4 elements: " + limited);


        // Sum all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);


        // Find max number
        OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Max number: " + max.orElse(-1));


        //  Find min number
        OptionalInt min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Min number: " + min.orElse(-1));


        // Count elements greater than 5
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("Count of numbers > 5: " + count);
    }
}

