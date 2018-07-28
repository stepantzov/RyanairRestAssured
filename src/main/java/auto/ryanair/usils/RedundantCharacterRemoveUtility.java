package auto.ryanair.usils;

public class RedundantCharacterRemoveUtility {
    public static String removeSpacesBracketsComas(String rawString) {
        String correctString = rawString.replace("[", "").replace("]", "").
                replace(",", "").replaceAll("\\s+", "");

        return correctString;
    }

    public static String removeBracketsOnly(String rawString) {
        String correctString = rawString.replace("[", "").replace("]", "").
                replace(",", "");

        return correctString;
    }
}