package Module5.t2_1;

public class Theater {
    int maxSeats = 10;
    int reservedSeats;
    public Theater(){
        this.reservedSeats = 0;
    }

    public synchronized boolean reserveSeat(int amount){
        int testi = reservedSeats+amount;
        if (testi<maxSeats){
            reservedSeats = testi;
            return true;
        } else{
            return false;
        }
    }


}
