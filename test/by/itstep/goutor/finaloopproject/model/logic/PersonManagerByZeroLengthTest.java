package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.Boss;
import by.itstep.goutor.finaloopproject.model.entity.Person;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import by.itstep.goutor.finaloopproject.model.entity.container.BossArmy;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonManagerByZeroLengthTest {
    Person[] people;
    Army army;
    Boss[] bosses;
    BossArmy bossArmy;

    @Before
    public void init() {
        people = new Person[]{};

        army = new Army(people);
    }

    @After
    public void clearing() {
        people = null;
        army = null;
    }

    @Test
    public void calculateTotalForceTestForNullLength() {
        int expected = -1;

        int actual = PersonManager.calculateTotalForce(army);

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateTotalLevelTestForNullLength() {
        int expected = -1;

        int actual = PersonManager.calculateTotalLevel(army);

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateTotalSpecialDamageTestForNullLength() {
        int expected = -1;

        int actual = PersonManager.calculateTotalSpecialDamage(army);

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateVinORNoTestForNullLength() {
        boolean expected = false;
        bosses = new Boss[]{};
        bossArmy = new BossArmy(bosses);

        boolean actual = PersonManager.calculateVinORNo(army, bossArmy);

        Assert.assertEquals(expected, actual);
    }
}
