package collections;
import  java.util.*;
public class StartCode {
    public static void  main(String[] args){
        System.out.println("Welcome to code java collection framework");


        //creating collection(type)
        //1.type safe (same type element add) 2.un type safe(differnet type element add)

        //type safe collection    ArrayList

        ArrayList<String> names = new ArrayList<>();
        names.add("Sandeep");
        names.add("Durgest");
        names.add("Vinay");
        names.add("Ram");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(2));

/*
        //un type safe
        LinkedList list = new LinkedList();
        list.add("Sachin");
        list.add("Ram");
        list.add("Shyam");
        list.add(42);
        list.add(true);
        System.out.println(list);
        */

        names.remove("Ram");
        System.out.println(names);


        System.out.println("----------------------------------------");
      HashSet<Double> nms = new HashSet<>();
      nms.add(14.32);
      nms.add(23.4344);
      nms.add(3454.3453);
      nms.add(34.4);
      nms.add(34.4);
      nms.add(5.0);
      System.out.println(nms);

        System.out.println("-----------------------------");
        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);

    }
}
