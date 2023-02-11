// https://www.geeksforgeeks.org/calculate-sum-of-all-numbers-present-in-a-string

import java.util.*;

public class SumNumbersString {
    public static void main(String[] args) {
        String str = "geeks4geeks";
        System.out.println(findSum(str));
    }

    private static long findSum(String str) {
        List<Integer> arrOfNum = new ArrayList<>();
        int sum = 0;
        findNumbers(arrOfNum, str);
        System.out.println(arrOfNum);
        for (var i : arrOfNum) sum += i;
        return sum;
    }

    private static void findNumbers(List<Integer> save, String str) {
        for (int left = 0; left < str.length(); left++) {
            while (left < str.length() && str.charAt(left) > 60) left++;
            int num = 0;
            for (int i = left; i < str.length() && str.charAt(i) < 60; i++) {
                num = 10 * num + (str.charAt(i) - '0');
                left = i;
            }
            save.add(num);
        }
    }
}
