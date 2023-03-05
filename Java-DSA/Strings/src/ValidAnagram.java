import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "aaaaab";
        String t = "aaaaaa";
        ValidAnagram solution = new ValidAnagram();
        System.out.println(solution.isAnagram(s, t));
        solution.testing("aaaaaa");
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> one = new HashMap<>();
        for (char c : s.toCharArray()) {
            one.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            if (one.get(c) == null) {
                one.put(c, 1);
                continue;
            }
            System.out.println(one);
            one.remove(c);
        }
        return one.isEmpty();
    }

    private void testing(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (char c : s.toCharArray()) {
            map.put(c, count);
            count++;
        }
        System.out.println(map);
        for (var c : map.keySet()) {
            map.remove(c);
            System.out.println(map);
        }
    }
}
