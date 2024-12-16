package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {

        // Create a list and filter all even number from list
        //
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);

        // list1
        // without stream

        System.out.println("Without Stream API");
        List<Integer> listEven = new ArrayList<>();

        for (Integer a : list1){
            if(a%2==0){
                listEven.add(a);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        // With Stream API
        System.out.println("With Stream API");

        /*
        Stream<Integer> stream = list1.stream();
        List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(collect);
         */

        List<Integer> collect = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(collect1);


    }
}
