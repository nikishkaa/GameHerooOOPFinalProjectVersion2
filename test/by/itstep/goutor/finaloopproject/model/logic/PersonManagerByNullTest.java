package by.itstep.goutor.finaloopproject.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class PersonManagerByNullTest {

    @Test
    public void PersonManagerTestByNull() {
        int expected = -1;

        int actual = PersonManager.calculateTotalForce(null);

        Assert.assertEquals(expected, actual, 0.0);
    }
}
