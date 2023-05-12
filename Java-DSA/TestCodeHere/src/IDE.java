import java.util.*;

class IDE {
    public static void main(String[] args) {
        List<Long> arr = new ArrayList<>();
        List<Long>  mini = new ArrayList<>();
        long n = 1000L;
        for (long i = 0L; i < n; i++) {
            for (long j = 0L; j < n; j++) {
                for (long k = 0L; k < n; k++) {
                    Long first = first(new Long[] {i, j, k});
                    Long second = second(i, j, k);
                    arr.add(first);
                    mini.add(second);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (!Objects.equals(arr.get(i), mini.get(i))) {
                System.out.println(arr.get(i) + " " + mini.get(i));
            }
        }
    }

    static long first(Long[] arr) {
        Long min = arr[0];
        for (Long j : arr) {
            if (min < j) {
                min = j;
            }
        }
        return min;
    }

    static long second(long one, long two, long three) {
        return Math.min(one, Math.min(two, three));
    }
}
