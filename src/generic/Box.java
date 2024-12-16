package generic;

public class Box {

    // Object class is topmost parent class of all java class

    Object container;

    public  Box(Object container){
        this.container=container;
    }

    public Object getValue(){
        return this.container;
    }

}
