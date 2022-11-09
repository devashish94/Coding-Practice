//import java.util.Stack;
//
//class A extends Thread {
//    String x;
//    Stack<Integer> t;
//
//    A (String x, Stack<Integer> t) {
//        this.x = x;
//        this.t = t;
//    }
//    void processA() {
//        for(char i : x.toCharArray()) {
//            if (i == '#') {
//                if (!t.empty()) {
//                    t.pop();
//                } else {
//                    continue;
//                }
//            } else {
//                t.push(i - '0');
//            }
//        }
//    }
//    @Override
//    void run() {
//        this.processA();
//    }
//}
//
//class B extends Thread {
//    void processB(String x, Stack<Integer> t) {
//        for(char i : x.toCharArray()) {
//            if (i == '#') {
//                if (!t.empty()) {
//                    t.pop();
//                } else {
//                    continue;
//                }
//            } else {
//                t.push(i - '0');
//            }
//        }
//    }
//}
//
//class SolutionBack {
//    public boolean backspaceCompare(String s, String t) {
//        Stack<Integer> a = new Stack<Integer>(), b = new Stack<Integer>();
//        process(s, a);
//        process(t, b);
//        return a.equals(b);
//    }
//    static void process(String x, Stack<Integer> t) {
//        for(char i : x.toCharArray()) {
//            if (i == '#') {
//                if (!t.empty()) {
//                    t.pop();
//                } else {
//                    continue;
//                }
//            } else {
//                t.push(i - '0');
//            }
//        }
//    }
//}
//
//public class BackspaceStringLeetcode {
//    public static void main(String[] args) {
//        SolutionBack sol = new SolutionBack();
//        String s = "ab##";
//        String t = "c#d#";
//        System.out.println(sol.backspaceCompare(s, t));
//    }
//}
