package oops;

public class Samosa {
    // properties
    private String shape;
    private String color;
    private String type;
    private int price;

    public Samosa(){
        shape = "Triangular";
        color = "Brown";
        type = "panner";
        price = 20;
    }

    public Samosa(String shape, String color, String type, int price) {
        this.shape = shape;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // behaviors

    public void showColor(){
        System.out.println("Samosa color is : "+color);
    }

    public void showPrice(){
        System.out.println("Samosa price is : "+price);
    }

    public void showSamosaDetails(){
        System.out.println("++++++++++++++++");
        System.out.println("Shape : "+shape);
        System.out.println("Color : "+color);
        System.out.println("Type : "+type);
        System.out.println("Price : "+price);
    }

}
