class outer{
    String msg="Hello world";

class inner {
    void display() {
        System.out.println(msg);
    }
}
}
public class innerclass{
    public static void main(String[] args) {
        outer o = new outer();
        outer.inner i = o.new inner();
        i.display();
    }
}

o/p=

  Hello world
  
