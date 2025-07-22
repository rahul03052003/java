class Q {
    int n;
    volatile boolean running = true;

    synchronized int get() {
        if (!running) return -1;
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n) {
        if (!running) return;
        this.n = n;
        System.out.println("Put: " + n);
    }

    void stop() {
        running = false;
    }
}

class Produces implements Runnable {
    Q q;
    Thread t;

    Produces(Q q) {
        this.q = q;
        t = new Thread(this, "Produces");
        t.setDaemon(true); // Optional: makes thread a daemon
    }

    public void run() {
        int i = 0;
        while (q.running) {
            q.put(i++);
            try {
                Thread.sleep(500); // Simulate production delay
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
        System.out.println("Producer stopped");
    }
}

class Consumes implements Runnable {
    Q q;
    Thread t;

    Consumes(Q q) {
        this.q = q;
        t = new Thread(this, "Consumes");
    }

    public void run() {
        while (q.running) {
            int val = q.get();
            if (val == -1) break;
            try {
                Thread.sleep(1000); // Simulate consumption delay
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        }
        System.out.println("Consumer stopped");
    }
}

public class producerc {
    public static void main(String[] args) {
        Q q = new Q();
        Produces p = new Produces(q);
        Consumes c = new Consumes(q);

        p.t.start();
        c.t.start();

        try {
            Thread.sleep(10000); // Let threads run for 10 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        q.stop(); // Gracefully stop both threads
        System.out.println("Main thread finished");
    }
}
o/p

  Put: 0
Got: 0
Put: 1
Got: 1
Put: 2
Put: 3
Got: 3
Put: 4
Put: 5
Got: 5
Put: 6
Put: 7
Got: 7
Put: 8
Put: 9
Got: 9
Put: 10
Put: 11
Got: 11
Put: 12
Put: 13
Got: 13
Put: 14
Put: 15
Got: 15
Put: 16
Put: 17
Got: 17
Put: 18
Put: 19
Main thread finished
Consumer stopped
