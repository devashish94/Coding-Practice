import java.util.*;

public class KunalGivenQuestions {
    public static void main(String[] args) {
        String in = "baccad", out = "";
        List<String> arr = new ArrayList<>();
        removeAllGivenCharacters(0, in, out, arr);
        out = arr.get(0);
        System.out.println(out);
    }
    private static void removeAllGivenCharacters(int i, String in, String out, List<String> arr) {
        if (i == in.length()) {
            arr.add(out);
            return;
        }
        if (in.charAt(i) != 'd') {
            out += in.charAt(i);
        }
        removeAllGivenCharacters(i + 1, in, out, arr);
    }
}
