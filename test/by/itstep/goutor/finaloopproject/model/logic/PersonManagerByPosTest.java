package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.*;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import by.itstep.goutor.finaloopproject.model.entity.container.BossArmy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonManagerByPosTest {
    Person[] people;
    Army army;
    Boss[] boss;
    BossArmy bossArmy;

    @Before
    public void creator() {
        people = new Person[]{new MagicianAstrologer("1", true, 100, 20, 20, 20, "", ""),
                new Knight("2", true, 100, 30, 30, 30, "", "")};

        army = new Army(people);
    }

    @After
    public void clearing() {
        people = null;
        army = null;
    }

    @Test
    public void calculateTotalForceTest() {
        int expected = 50;

        int actual = PersonManager.calculateTotalForce(army);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateTotalLevelTest() {
        int expected = 50;

        int actual = PersonManager.calculateTotalLevel(army);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateTotalSpecialDamageTest() {
        int expected = 50;

        int actual = PersonManager.calculateTotalSpecialDamage(army);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateCalculateVinORNoTest() {
        boss = new Boss[]{new Dragon("1", 10, 10, 10),
                new Hydra("2", 10, 10)};

        bossArmy = new BossArmy(boss);

        boolean expected = true;

        boolean actual = PersonManager.calculateVinORNo(army, bossArmy);

        assertEquals(expected, actual);
    }
}
