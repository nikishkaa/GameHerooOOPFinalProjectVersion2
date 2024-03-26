package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.Knight;
import by.itstep.goutor.finaloopproject.model.entity.MagicianAstrologer;
import by.itstep.goutor.finaloopproject.model.entity.Person;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonManagerTest {

    @Test
    public void calculateTotalStatsTest() {
        Person[] people = {
                new MagicianAstrologer("1", true, 100, 20, 20, 20),
                new Knight("2", true, 100, 30, 30, 30)};
        Army army = new Army(people);

        int[] expected = new int[]{50, 50, 50};


        int[] actual = PersonManager.calculateTotalStats(army);


        assertEquals(expected, actual);
    }

}
