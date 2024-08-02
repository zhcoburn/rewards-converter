import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        int cashValue = 100;
        double milesValue = cashValue/0.0035;
        RewardValue rewardValue = new RewardValue((double)cashValue);
        assertEquals((float)milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        double cashValue = 10000*0.0035;
        RewardValue rewardValue = new RewardValue((float)milesValue);
        assertEquals((double)cashValue, rewardValue.getCashValue());
    }
}
