import java.util.Stack;

class Solve implements Runnable {
    final private String s;
    final private Stack<Integer> a;

    @Override
    public void run() {
        process(this.s, this.a);
    }

    Solve(String a, Stack<Integer> z) {
        this.s = a;
        this.a = z;
    }

    void process(String x, Stack<Integer> t) {
        for(char i : x.toCharArray()) {
            if (i == '#' && !t.empty()) {
                t.pop();
            } else {
                t.push(i - '0');
            }
        }
    }
}

class SolutionBack {
    public boolean backspaceCompare(String s, String t) {
        Stack<Integer> a = new Stack<>(), b = new Stack<>();
        Solve oneObj = new Solve(s, a), twoObj = new Solve(t, b);
        Thread one = new Thread(oneObj), two = new Thread(twoObj);

        one.start();
        two.start();

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        return a.equals(b);
    }
}

public class MultithreadingBackspaceStringLeetcode {
    public static void main(String[] args) {
        SolutionBack sol = new SolutionBack();
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        System.out.println(sol.backspaceCompare(s, t));
    }
}
