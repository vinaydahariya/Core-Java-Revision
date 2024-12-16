package methodConstructorReference;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning Method references..");

        // provide the implementation of workInter
        WorkInter workInter;
        // static method ko refer kiya hai
        // ClassName::methodName
        workInter = Stuff::doStuff;
        workInter.doTask();
        Runnable runnable =  Stuff::threadTask;
        Thread d = new Thread(runnable);
        d.start();


        // refering non static method
        //Object::methodName
        Stuff obj = new Stuff();
        Runnable runnable1 = obj::printNumber;

        Thread d1 = new Thread(runnable1);
        d1.start();

    }
}
