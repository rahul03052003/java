class garbage {
    public void hi(){
        System.out.println("Hello");
    }
    protected void finalize(){
        System.out.println("World");
    }
}
public class garbages{
    public static void main(String[] args)
    {
        garbage g=new garbage();
        g=null;
        System.gc();
        System.out.println("End of main method");
    }

    }



o/p=
  End of main method
World
  
