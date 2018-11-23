import java.util.*;

public class ExperimentingWithSortingAndCollections {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Paul","John","John","Rebba","George");
        HashSet<String> namesHash = new HashSet<>(names);
        TreeSet<String> treeSet = new TreeSet<>(names);

        System.out.printf("names as a list:    %s%n",names);
        System.out.printf("names as a HashSet: %s%n",namesHash);
        System.out.printf("names as a TreeSet: %s%n",treeSet);

        Collections.sort(names, (a,b)->b.compareTo(a));

        System.out.printf("Names sorted: %s%n",names);


        Computer comp1 = new Computer("Eurocom", "X9C", 64, 10541.00);
        Computer comp2 = new Computer("Microsoft", "Surface Studio", 32, 6349.99);
        Computer comp3 = new Computer("Apple", "iMac Pro", 32, 6299.99);
        Computer comp4 = new Computer("Asus", "ROG", 32, 4499.99);
        Computer comp5 = new Computer("Asus", "ROG", 32, 4499.99);

        List<Computer> computerList = Arrays.asList(comp1, comp2, comp3, comp4, comp4,comp5);
        System.out.println(computerList);

        HashSet<Computer> hashSet = new HashSet<>(computerList);
        System.out.printf("HashSet of computers: %s%n ", hashSet);

        TreeSet<Computer> treeSet2 = new TreeSet<>(computerList);
        System.out.println(treeSet2);

        System.out.printf("computerList unsorted: %s%n", computerList);
        Collections.sort(computerList);
        System.out.printf("computerList sorted:   %s%n", computerList);
        Collections.sort(computerList, Collections.reverseOrder());
        System.out.printf("computerList sorted:   %s%n", computerList);


        //creating our own sort conditions
        Collections.sort(computerList, (a,b)-> {
            if (a.getPrice()>b.getPrice())
                return 1;
            else
                return -1;
        });
        System.out.printf("computerList sorted:   %s%n", computerList);
    }
}
