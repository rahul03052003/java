public class andor {
    public static void main(String[] args) {
        int a=5,b=10;
        if(a>10 && b++>10){
            System.out.println("AND condition met.");
        }
        System.out.println("Value of b after AND operation: "+b);
        if(a<10 || ++b>12){
            System.out.println("OR condition");
        }
        System.out.println("Value of b after OR operation: "+b);
    }
}
