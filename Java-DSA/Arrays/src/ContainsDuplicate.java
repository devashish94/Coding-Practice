import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        System.out.println(solution.containsDuplicate(new int[] {1, 2, 3, 1}));
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
