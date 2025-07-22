public class sleep extends Thread{
    sleep(){
        super("Demo");
        System.out.println("Child thread: "+this);
        start();
    }
    public void run(){
        try{
            for (int i=5;i>0;i--){
                System.out.println("Child: "+i);
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Exit");
    }

    public static void main(String[] args) {
        new sleep();
    }
}

o/p
  Child thread: Thread[#36,Demo,5,main]
Child: 5
Child: 4
Child: 3
Child: 2
Child: 1
Exit
