class SharedObject {
    synchronized void waitForSignal() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait();
            System.out.println(Thread.currentThread().getName() + " resumed after notify");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    synchronized void sendSignal() {
        System.out.println(Thread.currentThread().getName() + " is sending signal...");
        notify();
    }
}

public class WaitNotifyAlive {
    public static void main(String[] args) {
        SharedObject obj = new SharedObject();

        Thread waiter = new Thread(() -> obj.waitForSignal(), "Waiter");
        Thread notifier = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            obj.sendSignal();
        }, "Notifier");

        waiter.start();

        System.out.println("Is Waiter alive? " + waiter.isAlive());

        notifier.start();

        try {
            waiter.join();
        } catch (InterruptedException e) {}

        System.out.println("Is Waiter alive after join? " + waiter.isAlive());
        System.out.println("Main thread finished");
    }
}
o/p

  Waiter is waiting...
Is Waiter alive? true
Notifier is sending signal...
Waiter resumed after notify
Is Waiter alive after join? false
Main thread finished


  
