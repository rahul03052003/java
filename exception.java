public class exceptionhandle {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int r=a/b;
            System.out.println("Result is: "+r);
        }catch (ArithmeticException e){
            System.out.println("Divisible by zero error");
        }finally {
            System.out.println("Completed execution");
        }
    }
}


o/p
  Divisible by zero error
Completed execution
