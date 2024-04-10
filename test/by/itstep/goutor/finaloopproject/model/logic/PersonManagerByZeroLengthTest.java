package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.Person;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonManagerByZeroLengthTest {
    Person[] people;
    Army army;

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

        Assert.assertEquals(expected, actual);
    }

}
