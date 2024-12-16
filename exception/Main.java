package exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name : ");
        String name;

        try {
            name = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("hi "+name);

        int age ;
        System.out.print("Enter your Age : ");
        try {
            age = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Bye-Bye");
        }

        System.out.println(name +" your age is :"+age);



    }
}
