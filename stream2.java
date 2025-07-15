
import java.io.IOException;
import java.io.PrintStream;

public class stream1 {
    public static void main(String[] args)throws IOException {
        byte b[]=new byte[10];
        PrintStream o=System.out;
        o.println("Enter the values");
        int br=System.in.read(b);
//        String i=new String(b,0,br);
//        System.out.println("Input: "+i);
        o.println("Type: ");
        for(int i=0;i<br;i++){
            o.print((char)b[i]);
        }
        o.println();
    }
}


o/p
  
Enter the values
hello
Type: 
hello
