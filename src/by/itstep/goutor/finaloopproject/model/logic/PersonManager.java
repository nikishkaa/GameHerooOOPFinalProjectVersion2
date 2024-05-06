package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.Boss;
import by.itstep.goutor.finaloopproject.model.entity.Person;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import by.itstep.goutor.finaloopproject.model.entity.container.BossArmy;

import static by.itstep.goutor.finaloopproject.controller.Main.LOGGER;

public class PersonManager {
    public static int calculateTotalForce(Army armies) {
        if (armies == null || armies.getSize() == 0) {
            LOGGER.debug("Armies = null OR armies size = 0");
            return -1;
        }


        int totalForce = 0;
        for (Person person : armies.getPersons()) {
            totalForce += person.getForce();
            LOGGER.trace(String.format("person: " + person + " \ntotalForce %d", totalForce));
        }

        return totalForce;
    }

    public static int calculateTotalLevel(Army armies) {
        if (armies == null || armies.getSize() == 0) {
            LOGGER.debug("Armies = null OR armies size = 0");
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
            LOGGER.debug("Armies = null OR armies size = 0");
            return -1;
        }


        int totalSpecialDamage = 0;
        for (Person person : armies.getPersons()) {
            totalSpecialDamage += person.getSpecialDamage();
        }

        return totalSpecialDamage;
    }


    public static boolean calculateVinORNo(Army army, BossArmy bossArmy) {
        if (army == null || army.getSize() == 0
                || bossArmy == null || bossArmy.getSize() == 0) {
            LOGGER.debug("Armies = null OR armies size = 0 " +
                    "OR Boss army = null OR bos army size = 0");
            return false;
        }

        int totalStatsToVin = calcTotalStatsForVin(army);
        int totalBossNeedStat = calcTotalStatsBoss(bossArmy);


        return totalStatsToVin >= totalBossNeedStat;
    }

    private static int calcTotalStatsForVin(Army army) {
        int totalStats = 0;

        for (Person person : army.getPersons()) {
            totalStats += person.getForce();
            totalStats += person.getSpecialDamage();
        }


        return totalStats;
    }

    private static int calcTotalStatsBoss(BossArmy bossArmy) {
        int totalStats = 0;

        for (Boss boss : bossArmy.getBosses()) {
            totalStats += boss.getStatToVinToVin();
        }


        return totalStats;
    }
}
