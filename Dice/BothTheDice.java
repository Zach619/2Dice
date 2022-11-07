public class Dice {
    private Die6 die1;
    private Die6 die2;
    public Dice() {
        die1 = new Die6();
        die2 = new Die6();
        this.roll();
    }

    public int getValue() {
        return die1.getValue()+die2.getValue();
    }

    public int getValue(int dieNumber) {
        if(dieNumber == 1) {
            return this.die1.getValue();
        }else if(dieNumber == 2) {
            return this.die2.getValue();
        }else{
            return 0;
        }
    }

    public void roll() {
        this.die1.roll();
        this.die2.roll();
    }

    public int rollandgetValue() {
        this.roll();
        return this.getValue();
    }
}
