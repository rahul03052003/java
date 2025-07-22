class cal1{
    int v1,v2;
    cal1(int v1,int v2){
        this.v1=v2;
        this.v2=v2;
    }
    public void add(){
        System.out.println((v1+v2));
    }
}
class multiplethread extends cal1 implements Runnable {
    multiplethread(int n1, int n2) {
        super(n1, n2);
    }

    public void run() {
        add();
    }

    public static void main(String[] args) {
        multiplethread my1 = new multiplethread(2, 3);
        multiplethread my2 = new multiplethread(24, 37);
        Thread t1 = new Thread(my1);
        Thread t2 = new Thread(my2);
        t1.start();
        t2.start();
    }
}
o/p
74
6
  
