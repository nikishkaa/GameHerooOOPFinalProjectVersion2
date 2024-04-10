package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.Knight;
import by.itstep.goutor.finaloopproject.model.entity.MagicianAstrologer;
import by.itstep.goutor.finaloopproject.model.entity.Person;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonManagerByPosTest {
    Person[] people;
    Army army;

    @Before
    public void creator() {
        people = new Person[]{new MagicianAstrologer("1", true, 100, 20, 20, 20),
                new Knight("2", true, 100, 30, 30, 30)};

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

}