public class Constructor{
    public static void main(String[] args){
        Box box1 = new Box(10,5,5);
        Box box2 = new Box(5,5,5);
    }
}

class Box{
    double length;
    double height;
    double width;
    
    //constructor method
    public Box(double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }
}