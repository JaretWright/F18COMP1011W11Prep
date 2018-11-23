import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args)
    {
        IntStream.range(1,10)
                .forEach(num -> System.out.print(num+ " "));

        System.out.println("\n\nCalculating the average of 4 grades");
        int[] grades = {99, 87, 55, 92};
        Arrays.stream(grades)
              .average()
                .ifPresent(avg -> System.out.println("Average is: "+avg));

        List<Double> prices = Arrays.asList(99.9,10.2,88.4,100.2);
        prices.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .ifPresent(avg -> System.out.println("average is " +avg));

        Stream.of(1.5, 2.3, 3.7)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);


    }
}
