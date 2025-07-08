import shape.*;
public class shapeDemo {
    public static void main(String[] args) {
        circle c=new circle(5);
        rectangle r=new rectangle(4,6);
        triangle t=new triangle(3,7);
        System.out.println("Circle area: "+c.area());
        System.out.println("Rectangle area: "+r.area());
        System.out.println("Triangle area: "+t.area());
    }
}
