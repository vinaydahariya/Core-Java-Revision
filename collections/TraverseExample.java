package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Durgesh");
        names.add("Sitara");
        names.add("Roshni");
        names.add("Vandna");
        names.add("Vandna");
        names.add("ABC");

          //for each loop
      for(String str : names){
          System.out.println(str + "\t" +str.length()+"\t" );
          StringBuffer br = new StringBuffer(str);
          System.out.println(br.reverse());
      }
        System.out.println("------------------------------------");
      //traversing useing Iterator
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++++++++++++++++");
        //Backword iterator
        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious()){
            String previous=litr.previous();
            System.out.println(previous);
        }


        //Enumeration
        System.out.println("???????????????");
        names.forEach(name->{
            System.out.println(name);
        });


    }
}
