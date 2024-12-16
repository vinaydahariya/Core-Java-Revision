package methodConstructorReference.cons;

public class ConsMain {
    public static void main(String[] args) {
        System.out.println("Learning Constructor Reference");

        /*
        Provide provide = ()->{
            return new Student();
        };
         */

        Provide provide = Student::new;

        Student student = provide.getStudent();
        student.display();

    }
}
