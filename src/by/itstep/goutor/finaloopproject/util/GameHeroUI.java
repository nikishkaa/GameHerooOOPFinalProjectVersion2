package by.itstep.goutor.finaloopproject.util;


public class GameHeroUI {
    public static final StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static String getUserUI(int totalForce, int totalLevel) {
        BUILDER.append("\nTotal level ").append(totalLevel).append("\nTotal force ").append(totalForce);
        return BUILDER.toString();
    }
}
