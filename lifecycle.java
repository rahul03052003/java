class thread extends Thread{
    public void run(){
        System.out.println("Name of state "+this.getName());
        System.out.println("State "+getState());
    }
}
public class thread2{
    public static void main(String[] args)throws InterruptedException {
        thread t=new thread();
        System.out.println(Thread.currentThread().getName());
        t.setName("Child Thread");
        System.out.println("Child thread t: "+t.getState());
        System.out.println("Child name t:"+t.getName());

        t.start();
        System.out.println("T :"+t.getState());
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        System.out.println("T: "+t.getState());
        t.join();
        System.out.println("T: "+t.getState());
    }
}


o/p
  main
Child thread t: NEW
Child name t:Child Thread
T :RUNNABLE
1
2
3
4
5
T: RUNNABLE
Name of state Child Thread
State RUNNABLE
T: TERMINATED
