
class threadextend extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        threadextend t=new threadextend();
        t.start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        threadextend t1=new threadextend();
        t1.start();
    }
}
o/p

  
36
37
