public class Mommifier {
    public static char charA = 'a';
    public static char charE = 'e';
    public static char charI = 'i';
    public static char charO = 'o';
    public static char charU = 'u';
    public static String doubleA = "aa";
    public static String doubleE = "ee";
    public static String doubleI = "ii";
    public static String doubleO = "oo";
    public static String doubleU = "uu";


    public String convertString(String s) {
        if (s != null) {
            if (hasRepeatVowels(s)) {
                return insertMommy(s);
            } else {
                return s;
            }
        } else {
            throw new RuntimeException();
        }
    }

    public boolean hasRepeatVowels(String s) {
        boolean result = false;
        if (s.contains(doubleA) || s.contains(doubleE) || s.contains(doubleI) || s.contains(doubleO) || s.contains(doubleU)) {
            result = true;
        }
        return result;
    }

    public String insertMommy(String s) {
        String result = s;
        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i) == charA || s.charAt(i) == charE || s.charAt(i) == charI || s.charAt(i) == charO || s.charAt(i) == charU) && s.charAt(i) == s.charAt(i - 1)) {
                result = s.substring(0, i) + "mommy" + s.substring(i);
                break;
            }
        }
        if (hasRepeatVowels(result)) {
            return insertMommy(result);
        }
        return result;
    }
}
