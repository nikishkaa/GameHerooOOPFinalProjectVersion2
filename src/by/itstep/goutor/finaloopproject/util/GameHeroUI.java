package by.itstep.goutor.finaloopproject.util;


public class GameHeroUI {
    public static final StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static String getUserUI(int totalForce,
                                   int totalLevel,
                                   int totalSpecialDamage,
                                   boolean vin) {
        BUILDER.append("\nTotal hero level ").append(totalLevel)
                .append("\nTotal hero force ").append(totalForce)
                .append("\nTotal hero specialDamage ").append(totalSpecialDamage)
                .append("\nWin Boss or no? " +
                        "\n(This depends is sum of hero stats and boss level) ")
                .append(vin ? "You vin!\n" : "You lose!\n");
        return BUILDER.toString();
    }
}
