import java.util.HashMap;
import java.util.Scanner;

public class _08_Dictionary_and_Maps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.putIfAbsent(name, String.valueOf(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            if (map.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + map.get(s));
            }
        }
        in.close();
    }
}
