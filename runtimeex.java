public class runtimeex {
    public static void main(String[] args) {
        try{
            throw new RuntimeException("Custom runtime exception");
        }catch (RuntimeException e){
            System.out.println("RuntimeException caught: "+e.getCause());
            e.printStackTrace();
        }
    }
}
