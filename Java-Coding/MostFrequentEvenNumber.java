public class MostFrequentEvenNumber {
    public static void main(String[] args) {

//        int[] arr = {10000};
        int[] arr = {0,1,2,2,4,4,1};

        int even_check = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_check++;
            }
        }
        if (even_check == 0) {
            System.out.println(-1);
        }

        //Main Logic
        int[] a = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            if  (arr[i] % 2 == 0) {
                a[arr[i]]++;
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("The number = " + i +  " has frequency = " + a[i]);
        }
        int maxFreq = 0, element = 0, max_element = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= maxFreq) {
                maxFreq = a[i];
                element = i;
                System.out.println("freq of " + i + " is " + a[i] + " and maxFreq = " + maxFreq);
            }
        }
        System.out.println(element);

    }
}
