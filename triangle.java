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
