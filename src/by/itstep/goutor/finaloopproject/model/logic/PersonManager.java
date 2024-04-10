package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.Person;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;

public class PersonManager {
    public static int calculateTotalForce(Army armies) {
        if (armies == null || armies.getSize() == 0) {
            return -1;
        }


        int totalForce = 0;
        for (Person person : armies.getPersons()) {
            totalForce += person.getForce();
        }

        return totalForce;
    }

    public static int calculateTotalLevel(Army armies) {
        if (armies == null || armies.getSize() == 0) {
            return -1;
        }


        int totalLevel = 0;
        for (Person person : armies.getPersons()) {
            totalLevel += person.getLevel();
        }

        return totalLevel;
    }

    public static int calculateTotalSpecialDamage(Army armies) {
        if (armies == null || armies.getSize() == 0) {
            return -1;
        }


        int totalLevel = 0;
        for (Person person : armies.getPersons()) {
            totalLevel += person.getSpecialDamage();
        }

        return totalLevel;
    }
}
