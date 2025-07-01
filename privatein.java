interface car{
    private void model(){
        System.out.println("Tesla");
    }
    default void call(){
        model();
    }
}
class model implements car{
    //
}
public class privatein {
    public static void main(String[] args) {
      model m=new model();
      m.call();
    }
}

o/p
  Tesla
