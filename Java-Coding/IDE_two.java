import java.util.Stack;

public class IDE_two {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Integer> a = new Stack<Integer>(), b = new Stack<Integer>();
        process(s, a);
        process(t, b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        return a.equals(b);
    }
    static void process(String x, Stack<Integer> t) {
        for(char i : x.toCharArray()) {
            if (i == '#') {
                if (!t.empty()) {
                    t.pop();
                } else {
                    continue;
                }

            } else {
                t.push(i - '0');
            }
        }
    }
    public static void main(String[] args) {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        System.out.println(backspaceCompare(s, t));
    }
}
