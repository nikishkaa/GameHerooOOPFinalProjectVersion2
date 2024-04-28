package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.util.*;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import by.itstep.goutor.finaloopproject.model.entity.container.BossArmy;
import by.itstep.goutor.finaloopproject.model.logic.PersonManager;
import by.itstep.goutor.finaloopproject.view.Printer;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {
    public static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.DEBUG);

        Army army = ArmyCreator.initArmy();

        BossArmy bossArmy = BossArmyCreator.initBossArmy();

        int totalForce = PersonManager.calculateTotalForce(army);
        int totalLevel = PersonManager.calculateTotalLevel(army);
        int totalSpecialDamage = PersonManager.calculateTotalSpecialDamage(army);

        boolean vin = PersonManager.calculateVinORNo(army, bossArmy);


        Printer.print(army.toString());
        Printer.print(bossArmy.toString());
        Printer.print(GameHeroUI.getUserUI(totalForce, totalLevel,
                totalSpecialDamage, vin));


        LOGGER.info(army.toString());
        LOGGER.info(bossArmy.toString());
        LOGGER.info(GameHeroUI.getUserUI(totalForce, totalLevel,
                totalSpecialDamage, vin));



//        String filename = "d: /person.xml";
//        PersonXMLSerializer.serializer(filename, person);
//
//        System.out.println(PersonXMLSerializer.deserializer(filename));

    }
}
