import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class _07_Arrays {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        int n = Integer.parseInt(bufferedReader.readLine().trim());

//        List<Integer> arr = Stream
//                .of(bufferedReader.readLine()
//                .replaceAll("\\s+$", "")
//                .split(" "))
//                .map(Integer::parseInt)
//                .toList();
//
//        bufferedReader.close();
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        List<Integer> arr = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            arr.add(read.nextInt());
        }
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
