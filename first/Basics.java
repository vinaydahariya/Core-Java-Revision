package first;

public class Basics {
    public static void main(String[] args) {
        int a =5;
        System.out.println(40);
        System.out.println(40.7);
        System.out.println("We are learning java basic");
        System.out.println("Sandeep");
        System.out.print("First");
        System.out.println("second");
        System.out.printf("%d", a);

        char ch = 'A';
        String s = "Vinay";
        Double d = 65.987d;
        Float f = 4.2f;
        Long l = (long) 876789l;

        // 8 primitive

        // Not primitive data type
        System.out.println("------------------------");

        Student student1 = new Student();
        student1.setRollNo(112);
        student1.setName("vinay");
        student1.setAge(23);

        System.out.println(student1.toString());

        System.out.println(student1.getName());

        // best way
        Student student2 = new Student(114, "vishal", 24);
        System.out.println(student2.getName());
    }
}
