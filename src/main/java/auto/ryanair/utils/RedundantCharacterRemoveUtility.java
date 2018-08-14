package auto.ryanair.utils;

public class RedundantCharacterRemoveUtility {
    public static String removeSpacesBracketsComas(String rawString) {
        return rawString.replace("[", "").replace("]", "").
                replace(",", "").replaceAll("\\s+", "");
    }

    public static String removeBracketsOnly(String rawString) {
        return rawString.replace("[", "").replace("]", "").
                replace(",", "");
    }
}