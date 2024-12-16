package lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("MY System stats...");

        // Anonymous class example
        MyInter i1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is the first anonymous class");
            }
        };
        i1.sayHello();

        System.out.println("-----------------------");

        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is the second anonymous class");
            }
        };
        i2.sayHello();

        System.out.println("-------------------------------------------------");

        // Using lambda expression
        MyInter i3 = () -> System.out.println("This is the first time I am using lambda");
        i3.sayHello();

        System.out.println("-------------------------------------------------");

        // Using SumInter for lambda with parameters
        SumInter sumInter = (a, b) -> a + b;

        System.out.println("Sum of 2 and 6: " + sumInter.sum(2, 6));
        System.out.println("Sum of 23 and 4: " + sumInter.sum(23, 4));

        LengthInter lengthInter=(str -> str.length());
        System.out.println( "Length of the String is ; " +lengthInter.getLength("Sandeep Gautam"));
    }
}

