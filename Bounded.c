class Num<T extends Number> {
    T num;

    public Num(T num) {
        this.num = num;
    }

    public double getDouble() {
        return num.doubleValue();
    }

    public void showType() {
        System.out.println("Type: " + num.getClass().getName());
    }
}

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Num<Integer> n = new Num<>(15);
        n.showType();                 // Displays: java.lang.Integer
        System.out.println(n.getDouble());  // Displays: 15.0
    }
}
