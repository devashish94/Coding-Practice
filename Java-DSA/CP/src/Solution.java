import java.util.*;

public final class Solution {
    List<String> save = new LinkedList<>();
    public static void main(String[] args) {
        int n = 687;
        System.out.println(new Solution().splitNum(n));
    }
    public int splitNum(Integer num) {
        String s = num.toString();
        f(0, s, "");
        for (var i : save) {
            System.out.print(i + " ");
        }
        int max  = Integer.MAX_VALUE;
        for (int i = 0; i < save.size() - 1; i++) {
            for (int j = i + 1; j < save.size(); j++) {
                if (save.get(i).length() + save.get(j).length() != s.length()) {
                    continue;
                }
                Integer one = Integer.parseInt(save.get(i));
                Integer two = Integer.parseInt(save.get(j));
                System.out.println(one + " " + two);
                if (one + two < max) {
                    max = one + two;
                }
            }
        }
        return max;
    }
    private void f(int i, String in, String out) {
        if (i == in.length()) {
            if (out.length() == 0) {
                return;
            }
            save.add(out);
            return;
        }
        f(i + 1, in, out);
        f(i + 1, in, out + in.charAt(i));
    }
}
