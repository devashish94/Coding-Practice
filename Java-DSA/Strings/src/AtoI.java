public class AtoI {
    public static void main(String[] args) {
        String s = "-a1234";
        System.out.println(new AtoI().atoi(s));
    }
    int atoi(String s) {
        boolean negative = s.charAt(0) == '-';
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && negative) {
                continue;
            }
            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                return -1;
            }
            answer = 10 * answer + (s.charAt(i) - '0');
        }
        return negative ? -1 * answer : answer;
    }
}
