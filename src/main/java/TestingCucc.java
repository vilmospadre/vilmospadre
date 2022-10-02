public class TestingCucc {
    public String minusFirstLetter(String word) {
        if (word == null) {
            return "no can do, sir";
        } else if (word.length() == 0) {
            return "neither";
        } else {
            return word.substring(0, 1);
        }
    }
}
