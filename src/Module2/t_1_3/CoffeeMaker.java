package Module2.t_1_3;

public class CoffeeMaker {
    private String type;
    private int amount;
    private boolean isOn;
    final int minAmount;
    final int maxAmount;

    public CoffeeMaker() {
        this.isOn = false;
        this.type = "normal";
        minAmount = 10;
        maxAmount = 80;
    }

    public void power() {
        isOn = !isOn;
    }

    public void changeType() {

        if (this.type.equalsIgnoreCase("normal")){
            this.type = "espresso";
        } else{
            this.type = "normal";
        }
    }

    public void selectAmount(int amount) {
        if (amount >= minAmount && amount <= maxAmount) {
            this.amount = amount;
        } else {
            this.amount = 10;
        }
    }

    public boolean isOn() {
        return this.isOn;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getType() {
        return this.type;
    }

    public static void main(String[] args) {
        CoffeeMaker kahvinkeitin = new CoffeeMaker();

        kahvinkeitin.selectAmount(10);
        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!kahvinkeitin.isOn())
                kahvinkeitin.power();

            while (!tired) {
                kahvinkeitin.changeType();
                System.out.println("making " + kahvinkeitin.getType() + " coffee " + kahvinkeitin.getAmount() + "ml");
                kahvinkeitin.selectAmount(kahvinkeitin.getAmount() + 10);
                if (kahvinkeitin.getAmount() % 30 == 0)
                    tired = true;
            }

            kahvinkeitin.power();

            System.out.println("Falling asleep");
        }
    }
}

