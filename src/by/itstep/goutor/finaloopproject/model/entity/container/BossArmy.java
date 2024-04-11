package by.itstep.goutor.finaloopproject.model.entity.container;

import by.itstep.goutor.finaloopproject.model.entity.Boss;

import java.util.Arrays;

public class BossArmy {
    private static final int DEFAULT_SIZE = 3;

    private Boss[] bosses;

    public BossArmy() {
        bosses = new Boss[DEFAULT_SIZE];
    }

    public BossArmy(Boss[] bosses) {
        this.bosses = bosses;
    }

    public Boss[] getBosses() {
        return bosses;
    }

    public void setBosses(Boss[] bosses) {
        this.bosses = bosses;
    }

    public int getSize() {
        return bosses.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\nList of bosses: \n");

        for (Boss boss : bosses) {
            builder.append(boss).append("\n");
        }

        return builder.toString();
    }
}
