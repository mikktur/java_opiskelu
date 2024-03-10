package Module5.t1_2;

public class Sum extends Thread {
    private int[] numbers;
    int sum;
    private int iLo;
    private int iHi;
    public Sum(int[] numbers,int iLo,int iHi){
        this.numbers = numbers;
        this.iLo = iLo;
        this.iHi = iHi;
    }
    @Override
    public void run() {
        sum = 0;
        for (int i = iLo; i <= iHi; i++) {
            sum += numbers[i];

        }

    }

    public static void main(String[] args) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores: " + cores);
    }
    public int getSum(){
        return sum;
    }

}
