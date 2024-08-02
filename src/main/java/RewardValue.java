public class RewardValue {

    private double cashValue;
    private float milesValue;

    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
        milesValue = (float)(cashValue/0.0035);
    }

    public RewardValue(float milesValue)
    {
        this.milesValue = milesValue;
        cashValue = milesValue*0.0035;
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public float getMilesValue()
    {
        return milesValue;
    }
}
