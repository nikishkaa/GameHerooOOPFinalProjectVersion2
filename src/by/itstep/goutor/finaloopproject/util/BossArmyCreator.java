package by.itstep.goutor.finaloopproject.util;

import by.itstep.goutor.finaloopproject.model.entity.Boss;
import by.itstep.goutor.finaloopproject.model.entity.Dragon;
import by.itstep.goutor.finaloopproject.model.entity.Hydra;
import by.itstep.goutor.finaloopproject.model.entity.container.BossArmy;

public class BossArmyCreator {
    public static BossArmy initBossArmy() {
        Boss[] bosses = new Boss[]{
                new Dragon("Dragon 1", RndInit.getMaxBossStat(), 10, 10),

                new Hydra("Hydra 1", RndInit.getMaxBossStat(), 3)};

        return new BossArmy(bosses);
    }
}
