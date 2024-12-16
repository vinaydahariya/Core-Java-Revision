package oops;

public class Child extends Parent {
    String cycle="HERO";
    String car = "BMW";

    public void print(){
        System.out.println(cycle);
        System.out.println(this.car);
        System.out.println(super.car);
    }
}
