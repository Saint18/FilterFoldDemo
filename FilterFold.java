import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterFold {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtering numbers greater than or equal to 5
        Optional<Integer> sum = numbers.stream()
                                       .filter(n -> n >= 5)
                                       .reduce((a, b) -> a + b);

        // Check if sum is present and print it
        sum.ifPresent(System.out::println);  // Output will be 45
    }
}
