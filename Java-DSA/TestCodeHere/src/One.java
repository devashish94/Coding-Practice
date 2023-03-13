import java.util.*;

public class One {
    public static void main(String[] args) {
        Queue<Integer[]> arr = new LinkedList<>();
        arr.add(new Integer[]{1, 2});
        arr.add(new Integer[]{0, 1});
        arr.add(new Integer[]{4, 5});
        arr.add(new Integer[]{30, 3});
        System.out.println(arr);
        arr.remove();
        System.out.println(arr);
    }
}
