class single {
    int a = 10;
    int b = 20;
    public void add() {
    }
}
class sum extends single{
    public void add(){
        int c=a+b;
        System.out.println("Sum is:-"+c);
    }

    public static void main(String[] args) {
        sum s=new sum();
        s.add();
    }
}



o/p-

  Sum is:-30
