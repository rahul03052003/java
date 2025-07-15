class threadextend1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("From "+Thread.currentThread().getName()+"  value"+i+"\n");
        }
    }

    public static void main(String[] args) {
        new threadextend1().start();
        new threadextend1().start();
    }
}


o/p
  From Thread-1  value1

From Thread-1  value2

From Thread-0  value1

From Thread-0  value2

From Thread-0  value3

From Thread-0  value4

From Thread-0  value5

From Thread-1  value3

From Thread-1  value4

From Thread-1  value5
