import java.util.ArrayList;
import java.util.Collections;

public class PowerSet {
    public static void main(String[] args) {
        System.out.println(powerSet("abcd"));
    }
    static ArrayList<String> powerSet(String s) {
        ArrayList<String> arr = new ArrayList<>();
        helper(0, s, "", arr);
        return arr;
    }

    private static void helper(int index, String in, String out, ArrayList<String> save) {
        if (index == in.length()) {
            save.add(out);
            return;
        }
        helper(index + 1, in, out, save);
        helper(index + 1, in, out + in.charAt(index), save);
    }
}
