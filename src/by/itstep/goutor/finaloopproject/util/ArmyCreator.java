package by.itstep.goutor.finaloopproject.util;

import by.itstep.goutor.finaloopproject.model.entity.Ability;
import by.itstep.goutor.finaloopproject.model.entity.Knight;
import by.itstep.goutor.finaloopproject.model.entity.MagicianAstrologer;
import by.itstep.goutor.finaloopproject.model.entity.Person;
import by.itstep.goutor.finaloopproject.model.entity.container.Army;

public class ArmyCreator {
    public static Army initArmy() {
        int magicDamage = UserInit.getMagicDamage();
        int knightDamage = UserInit.getKnightDamage();

        Person[] person = new Person[]{
                new MagicianAstrologer("magician astrologer 1", Person.DEFAULT_ALIVE,
                        Person.DEFAULT_HP, 20, 20, magicDamage, "", Ability.FLYING.toString()),

                new Knight("knight 1", Person.DEFAULT_ALIVE,
                        Person.DEFAULT_HP, 30, 30, knightDamage, "", Ability.FIRE.toString())};


        return new Army(person);
    }
}
