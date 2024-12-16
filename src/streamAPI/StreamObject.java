package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // Stream API - collection process
        // collection / group of object

        // 1- blank
        Stream<Object> emptyStream = Stream.empty();
//        emptyStream.forEach(e->{
//            System.out.println(e);
//        });

        // 2- array, object, colection
        String names[] = {"Durgesh", "Uttam", "Vinay", "Sandeep", "Divya"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

        // 3 -
        Stream<Object> build = Stream.builder().build();

        // 4 -
        IntStream stream = Arrays.stream(new int[]{2, 4, 65, 3, 564});
        stream.forEach(e->{
            System.out.println(e);
        });

        // 5- list, set
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(23);
        list.add(78);

        Stream<Integer> stream2 = list.stream();
        stream2.forEach(e->{
            System.out.println(e);
        });


    }
}
