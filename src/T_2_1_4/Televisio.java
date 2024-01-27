package T_2_1_4;

public class Televisio {
    private int currChannel;
    private int currDay;
    public Televisio(){
        this.currDay = 1;
        this.currChannel = 1;

    }
    public void changeChannel(){
        if(currChannel < 10){
            currChannel += 1;

        }else{
            currChannel = 1;
        }
    }
    public void wakeUp(){
        System.out.println("Woke up, day " + currDay);
    }
    public void sleep(){
        System.out.println("Falling asleep");
        currDay++;
    }
    public void watch(){
        int channels;
        wakeUp();
        if (currDay == 1){
            channels = 3;
        } else if (currDay % 2 ==0) {
            channels = 4;
        } else{
            channels = 6;
        }
        for (int i = 0; i < channels; i++) {
            System.out.println("Watching channel " + currChannel);
            changeChannel();
        }
        sleep();
    }
}
