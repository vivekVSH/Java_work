
class word extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Word");
        }

    }
}

class pass implements Runnable {
    public void run() {
        System.out.print("Namste");
    }
}

public class thread {

    public static void main(String[] args) {
        System.out.println("Vivek");
        for (int i = 0; i < 10; i++) {
            System.out.println("Vivek");
        }
        System.out.println(Thread.currentThread().getName());
        word wk = new word();
        wk.start();

        pass pk = new pass();
        Thread T1 = new Thread(pk);
        T1.start();
    }
}
