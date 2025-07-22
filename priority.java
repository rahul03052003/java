import static java.lang.Thread.*;

class ThreadPriority extends Thread {
    public ThreadPriority(int p) {
        this.setPriority(p);
    }

    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("from " + this.getName() + " with i value= " + i);
        }
    }
}

public class prority {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("from main Thread " + Thread.currentThread() + " with i value= " + i);
        }

        ThreadPriority t = new ThreadPriority(MAX_PRIORITY);
        t.setName("MAX");
        t.start();

        ThreadPriority high = new ThreadPriority(NORM_PRIORITY + 2);
        ThreadPriority low = new ThreadPriority(NORM_PRIORITY - 2);

        high.setName("High Thread");
        low.setName("Low Thread");

        low.start();
        high.start();

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
    }
}
o/p
from main Thread Thread[#3,main,5,main] with i value= 5
from main Thread Thread[#3,main,5,main] with i value= 4
from main Thread Thread[#3,main,5,main] with i value= 3
from main Thread Thread[#3,main,5,main] with i value= 2
from main Thread Thread[#3,main,5,main] with i value= 1
from MAX with i value= 5
from Low Thread with i value= 5
from Low Thread with i value= 4
from Low Thread with i value= 3
from Low Thread with i value= 2
from Low Thread with i value= 1
from MAX with i value= 4
from MAX with i value= 3
from MAX with i value= 2
from MAX with i value= 1
from High Thread with i value= 5
from High Thread with i value= 4
from High Thread with i value= 3
from High Thread with i value= 2
from High Thread with i value= 1
  
