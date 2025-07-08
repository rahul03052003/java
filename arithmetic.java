public class arithmetic{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int r=a/b;
            System.out.println("Result is: "+r);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Completed execution");
        }
    }
}

