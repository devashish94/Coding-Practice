import java.util.*;

public class StringSubsets {
    public static void main(String[] args) {
        String str = "abc", out = "";
        LinkedList<String> allAnswers = new LinkedList<>();
        subset(0, str, out, allAnswers);
        for (var i : allAnswers) {
            System.out.println(i);
        }
    }

    private static void subset(int i, String in, String out, LinkedList<String> all) {
        if (i == in.length()) {
            if (out.length() == 0) {
                all.add("{}");
                return;
            }
            all.add(out);
            return;
        }
        subset(i + 1, in, out, all);
        out += in.charAt(i);
        subset(i + 1, in, out, all);
    }
}
