shape.java

  package shape;

public abstract class Shape{
    public abstract double area();
}


circle.java

  package shape;

    public  class circle extends Shape{
        public  double radius;
        public  circle(double radius){
            this.radius=radius;
        }
        @Override
    public  double area(){
            return Math.PI*radius*radius;
        }
    }


rectangle.java

  package shape;

public class rectangle extends Shape{
    public double length,breadth;
    public rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public  double area(){
        return length*breadth;
    }
}

triangle.java

  package shape;

public class triangle extends Shape{
    public double base,height;
    public triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    @Override
    public  double area() {
        return 0.5*base*height;
    }
}


shapedemo.java
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


o/p

  Circle area: 78.53981633974483
Rectangle area: 24.0
Triangle area: 10.5

