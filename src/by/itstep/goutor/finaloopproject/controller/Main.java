package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.entity.*;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import by.itstep.goutor.finaloopproject.model.entity.container.BossArmy;
import by.itstep.goutor.finaloopproject.model.logic.PersonManager;
import by.itstep.goutor.finaloopproject.util.GameHeroUI;
import by.itstep.goutor.finaloopproject.util.RndInit;
import by.itstep.goutor.finaloopproject.util.UserInit;
import by.itstep.goutor.finaloopproject.view.Printer;

public class Main {
    public static void main(String[] args) {
        int magicDamage = UserInit.getMagicDamage();
        int knightDamage = UserInit.getKnightDamage();

        Person[] person = new Person[]{
                new MagicianAstrologer("magician astrologer 1", Person.DEFAULT_ALIVE,
                        Person.DEFAULT_HP, 20, 20, magicDamage),

                new Knight("knight 1", Person.DEFAULT_ALIVE,
                        Person.DEFAULT_HP, 30, 30, knightDamage)};

        Army army = new Army(person);


        Boss[] bosses = new Boss[]{
                new Dragon("Dragon 1", RndInit.getMaxBossStat(), 10, 10),

                new Hydra("Hydra 1", RndInit.getMaxBossStat(), 3)};

        BossArmy bossArmy = new BossArmy(bosses);

        int totalForce = PersonManager.calculateTotalForce(army);
        int totalLevel = PersonManager.calculateTotalLevel(army);
        int totalSpecialDamage = PersonManager.calculateTotalSpecialDamage(army);
        boolean vin = PersonManager.calculateVinORNo(army, bossArmy);


        Printer.print(army.toString());
        Printer.print(bossArmy.toString());
        Printer.print(GameHeroUI.getUserUI(totalForce, totalLevel, totalSpecialDamage, vin));
    }
}
