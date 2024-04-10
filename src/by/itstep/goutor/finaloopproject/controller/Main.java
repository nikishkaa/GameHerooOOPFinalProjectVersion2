package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.entity.Knight;
import by.itstep.goutor.finaloopproject.model.entity.MagicianAstrologer;
import by.itstep.goutor.finaloopproject.model.entity.Person;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;
import by.itstep.goutor.finaloopproject.model.logic.PersonManager;
import by.itstep.goutor.finaloopproject.util.GameHeroUI;
import by.itstep.goutor.finaloopproject.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[]{new MagicianAstrologer("1", true, 100, 20, 20, 20),
                new Knight("2", true, 100, 30, 30, 30)};
        Army army = new Army(person);

        int totalForce = PersonManager.calculateTotalForce(army);

        Printer.print(army.toString());
        Printer.print(GameHeroUI.getUserUI(totalForce));
    }
}
