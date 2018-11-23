import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ExperimentingWithStreams {
    public static void main(String[] args)
    {

        Computer comp1 = new Computer("Eurocom", "X9C", 64, 10541.00);
        Computer comp2 = new Computer("Microsoft", "Surface Studio", 32, 6349.99);
        Computer comp3 = new Computer("Apple", "iMac Pro", 32, 6299.99);
        Computer comp4 = new Computer("Asus", "ROG", 32, 4499.99);

        List<Computer> computerList = Arrays.asList(comp1, comp2, comp3, comp4);

        //get the total value of the computers in the list
        double inventoryValue =
                computerList.stream()
                            .collect(Collectors.
                                    summingDouble((computer -> computer.getPrice())));

        System.out.printf("The total value of the computers is $%.2f%n", inventoryValue);

        //Use the .collect method to collect all the brands in 1 list
        List<String> brands = computerList.stream()
                                    .map(computer -> computer.getBrand())
                                    .collect(Collectors.toList());
//
//        List<String> brands = computerList.stream()
//                                    .map(Computer::getBrand)
//                                    .collect(Collectors.toList());
        System.out.println("Brands in the collection: "+brands.toString());
        Collections.sort(brands);
        System.out.println("Brands in the collection: "+brands.toString());

        //How can we figure out the average price of the computers?
        //Historically we would create a method and pass the collection
        //into the method, then have the avg returned.  With streams
        //we can get that information directly
        computerList.stream()
                .mapToDouble(computer -> computer.getPrice())
                .average()
                .ifPresent(avg -> System.out.printf("The average price of a computer is $%.2f", avg));
    }
}
