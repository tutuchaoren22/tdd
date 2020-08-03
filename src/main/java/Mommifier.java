public class Mommifier {

    public String convertString(String s) {
        if (s != null ){
            if (hasRepeatVowels(s)){
                return insertMommy(s);
            }else {
                return s;
            }
        }else {
            throw new RuntimeException();
        }
    }

    public boolean hasRepeatVowels(String s){
        boolean result=false;
        if (s.contains("aa")||s.contains("ee")||s.contains("ii")||s.contains("oo")||s.contains("uu")){
            result=true;
        }
        return result;
    }

    public String insertMommy(String s){
        return "";
    }
}
