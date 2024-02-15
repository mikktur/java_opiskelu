package Module4.t1_1;

public class Odd extends Thread {
    private int start;
    private int end;

    public Odd(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {

        if (start % 2 == 0) {
            for (int i = start+1; i <= end; i += 2) {
                System.out.println("Odd Thread: " + i);
            }
        } else {
            for (int i = start; i <= end; i += 2) {
                System.out.println("Odd Thread: " + i);
            }
        }

    }
}


