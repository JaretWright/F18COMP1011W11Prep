import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams101 {
    public static void main(String[] args)
    {

        List<String> fruits = Arrays.asList("pear","banana", "apricot","apple");

        //sort the stream and display it
        System.out.println("Here is the sorted stream");
        fruits.stream()
                .sorted()
                .forEach((fruit)->System.out.print(fruit +" "));

        //validate that the underlying collection was not changed
        System.out.printf("%nfruits collection: %s%n", fruits);

        //find the first element in a sorted stream
        System.out.println("The first fruit in the sorted stream is: ");
        fruits.stream()
                .sorted()
                .findFirst()
                .ifPresent((fruit)->System.out.println(fruit));

        //filter for fruit that start with the letter "a"
        System.out.printf("%n%nFruit that start with the letter 'a'%n");
        fruits.stream()
                .sorted()
                .filter((fruit) -> fruit.startsWith("a"))
                .forEach((fruit)->System.out.println(fruit));

        //display all of the fruit elements in upper case without changing the
        //underlying collection of String objects
        System.out.printf("%n%nUsing the map function to change the fruit to upper case: ");
        fruits.stream()
                .map(fruit -> fruit.toUpperCase())
//                .sorted()
                .forEach(fruit -> System.out.print(fruit + " "));


        //create a new List object based on the Stream created
        List<String> coolNewList = fruits.stream()
                                        .sorted()
                                        .map(fruit -> fruit.toUpperCase())
                                        .collect(Collectors.toList());
        System.out.println("\n\nThe new sorted List of fruits: "+coolNewList);
    }
}
