package Module4.t1_2;

import Module4.t1_2.Sum;

public class Split {
    static int N = 15;

    public static void execute(int[] numbers, int cores) {
        Sum[] sums = new Sum[cores];
        int slicey = 0;
        int dy = N / cores;
        int remainder = N % cores;

        for (int i = 0; i < cores; i++) {
            int end = slicey + dy + (i < remainder ? 1 : 0) - 1;
            sums[i] = new Sum(numbers, slicey, end);
            slicey = end + 1;
        }
        for (Sum sum : sums) {

            sum.start();
        }
        int result = 0;
        for (Sum sum : sums) {
            try {
                sum.join();
            } catch (InterruptedException e) {
                // thread was interrupted, the result may be incorrect
                e.printStackTrace();
            }
            result += sum.getSum();
        }

        System.out.println("The result is " + result);
    }
    public static void main(String[]args){
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = i;
        }
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores: " + cores);
        execute(numbers, cores);

    }
}

