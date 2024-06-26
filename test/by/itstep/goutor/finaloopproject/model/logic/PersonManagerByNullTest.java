package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.container.BossArmy;
import org.junit.Assert;
import org.junit.Test;

public class PersonManagerByNullTest {

    @Test
    public void calculateTotalForceTestByNull() {
        int expected = -1;

        int actual = PersonManager.calculateTotalForce(null);

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateTotalLevelTestByNull() {
        int expected = -1;

        int actual = PersonManager.calculateTotalLevel(null);

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateTotalSpecialDamageTestByNull() {
        int expected = -1;

        int actual = PersonManager.calculateTotalSpecialDamage(null);

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateVinORNoTestByNull() {
        boolean expected = false;

        boolean actual = PersonManager.calculateVinORNo(null, null);

        Assert.assertEquals(expected, actual);
    }
}
