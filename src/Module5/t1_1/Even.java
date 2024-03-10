package Module5.t1_1;

public class Even extends Thread {
    private int start;
    private int end;

    public Even(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        if (start == 0 || start % 2 == 0) {
            for (int i = start+2; i <= end; i += 2) {
                System.out.println("Even Thread: " + i);
            }
        } else {
            for (int i = start + 1; i <= end; i += 2) {
                System.out.println("Even Thread: " + i);
            }
        }
    }
}


