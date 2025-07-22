class MyRunnable implements Runnable{
    public synchronized void run(){
        for(int i=0; i<4; i++){
            System.out.println("From "+Thread.currentThread().getName() + " is i= "+i);
        }
    }
}
public class simple {
    public static void main(String[] args) {
        Runnable task= new MyRunnable();
        Thread t1= new Thread(task, "Thread-1");
        Thread t2= new Thread(task, "Thread-2");
        t1.start();
        t2.start();
    }
}

o/p
  
From Thread-1 is i= 0
From Thread-1 is i= 1
From Thread-1 is i= 2
From Thread-1 is i= 3
From Thread-2 is i= 0
From Thread-2 is i= 1
From Thread-2 is i= 2
From Thread-2 is i= 3
