package oops;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*

        System.out.println("going to create samosas");
        Samosa s1 = new Samosa("Triangular", "LightBlue", "Aloo", 12);
        Samosa s2 = new Samosa();


        s1.showSamosaDetails();
        s2.showSamosaDetails();


        List<Samosa> samosas = new ArrayList<>();
        samosas.add(s1);
        samosas.add(s2);

        System.out.println("Details of all Samosas in the list:");
        samosas.forEach(samosa -> samosa.showSamosaDetails());

        System.out.println("________________________________________");

        Child child = new Child();
        System.out.println(child.car);
        System.out.println(child.cycle);

        child.print();

        System.out.println("__________________________________________");


         */

        SBI sbi = new SBI();
        sbi.interest();
        sbi.loan();
        sbi.charges();



    }
}
