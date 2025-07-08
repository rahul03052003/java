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
