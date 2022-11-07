public class BothTheDice {
    private Die6 Die1;
    private Die6 Die2;
    public BothTheDice() {
        Die1 = new Die6;
        Die2 = new Die6;
        this.roll();
    }
      public int getValue() {
        return Die1.getValue()+Die2.getvalue();
    }
    public int getValue(int dieNumber) {
        if(dieNumber == 1) {
            return this.die1.getValue();
        }else if(dieNumber == 2) {
            return this.die2.getValue();
        }   
        }
    public void roll() {
        this.Die1.roll();
        this.Die2.roll();
    }
    public int rollandgetValue() {
        this.roll();
        return this.getValue();
    }
}
