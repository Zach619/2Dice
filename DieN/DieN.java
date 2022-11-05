public class DieN {
    private int value;
    private int sides;
    public DieN() {
        this.roll();
    }
    public void roll() {
        this.value = (int)(Math.random()*this.sides + 1);
    }
    public int getValue() {
        return value;
    }
    public int rollandgetValue() {
        roll();
        return getValue();
    }
}
