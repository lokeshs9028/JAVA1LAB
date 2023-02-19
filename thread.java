class threadA extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            if (i == 1)
                System.out.println("\t From thread A: i= " + i);
        }
        System.out.println("Exit from A");
    }
}

class threadB extends Thread {
    public void run() {
        for (int j = 1; j < 5; j++) {
            if (j == 3)
                System.out.println("\t From thread B: j= " + j);
        }
        System.out.println("Exit from B");
    }
}

class threadC extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            if (k == 1) {
                try {
                    k += k;
                } catch (Exception e) {

                }
            }
        }
        System.out.println("Exit from thread C");
    }
}

public class thread {
    public static void main(String args[]) {
        new threadA().start();
        new threadB().start();
        new threadC().start();
    }
}