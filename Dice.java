public class BothTheDice {
    private int Die1;
    private int Die2;
    public BothTheDice() {
        roll();
    }
    public void roll() {
        Die1 = (int)(Math.random() * 6 + 1);
        Die2 = (int)(Math.random() * 6 + 1);
    }
    public int getvalueDie1() {
        return Die1;
    }
    public int getvalueDie2() {
        return Die2;
    }
    public int CombineBoth() {
        return Die1 + Die2;
    }
}
