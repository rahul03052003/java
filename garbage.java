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
        //garbage g=new garbage(); //first way
       // g=null;
        //System.gc();

       // new garbage();  //second way
        // System.gc();

        garbage g1=new garbage();  //third way
        g1.finalize();


        System.out.println("End of main method");
    }

}





o/p=
  End of main method
World
  
