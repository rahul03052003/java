interface A{
    default void start(){
        System.out.println("Start the car");
    }
}
class defaultin implements A {
    public void start(){
        System.out.println("Start now");
    }

    public static void main(String[] args) {
        A i=new defaultin();
        i.start();
    }
}


Start now
