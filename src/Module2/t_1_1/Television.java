package Module2.t_1_1;

public class Television {
    private int currChannel;
    private boolean isOn;

    public Television() {
        this.isOn = false;
        this.currChannel = 1;

    }

    public void setChannel(int chan) {
        if(this.currChannel <10){
            this.currChannel = chan;
        }else{
            this.currChannel = 1;
        }
    }

    public void pressOnOff() {
        isOn = !isOn;

    }


    public boolean isOn() {
        return this.isOn;
    }
    public int getChannel(){
        return currChannel;
    }
}