package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        // filter (Predicate)
            // boolean value function
            // e->e>10



        // map(Function)
        /*
            each element operation


        */

        List<String> names = List.of("Aman", "Ankit", "Abhay", "Vinay", "Vinod", "Bittu", "Champak", "Jethalal");
        List<String> a = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);

        List<Integer> numbers = List.of(23, 4, 2, 5, 7, 4);
        List<Integer> collect = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);

        names.stream().forEach(e->{
            System.out.println(e);
        });

        collect.stream().forEach(System.out::println);

        // sorted
        numbers.stream().sorted().forEach(System.out::println);

        Integer i = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min = "+i);
    }
}
