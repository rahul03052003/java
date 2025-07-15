     import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
public class stream {
    public static void main(String[] args) throws IOException {
        byte[] d={72,101,108,108,111};
        InputStream I=new ByteArrayInputStream(d);

        int b;
        while((b=I.read())!=-1){
            System.out.print((char)b);
        }
        System.out.println();
    }
}


o/p

  Hello
