public class DieN {
    private int value;
    private int sides;
    public DieN(int sides) {
        this.sides = sides;
        this.roll();
    }

    public void roll() {
        this.value = (int)(Math.random()*sides) + 1;
    }

    public int getValue() {
        return value;
    }

    public int rollandgetValue() {
        roll();
        return getValue();
    }
}
