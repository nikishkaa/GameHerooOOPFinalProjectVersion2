package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import by.itstep.goutor.finaloopproject.model.entity.container.BossArmy;
import by.itstep.goutor.finaloopproject.model.logic.PersonManager;
import by.itstep.goutor.finaloopproject.util.*;
import by.itstep.goutor.finaloopproject.view.Printer;

public class Main {
    public static void main(String[] args) {


        Army army = ArmyCreator.initArmy();

        BossArmy bossArmy = BossArmyCreator.initBossArmy();

        int totalForce = PersonManager.calculateTotalForce(army);
        int totalLevel = PersonManager.calculateTotalLevel(army);
        int totalSpecialDamage = PersonManager.calculateTotalSpecialDamage(army);
        boolean vin = PersonManager.calculateVinORNo(army, bossArmy);


        Printer.print(army.toString());
        Printer.print(bossArmy.toString());
        Printer.print(GameHeroUI.getUserUI(totalForce, totalLevel, totalSpecialDamage, vin));
    }
}
