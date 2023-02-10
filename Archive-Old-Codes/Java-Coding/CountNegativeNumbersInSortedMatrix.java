public class CountNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{5, 1, 0}, {-5, -5, -5}};
//        int[][] grid = {{3, 2, 0}, {-5, -5, -5}};
//        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.print(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count = 0, firstOccuranceIndex = 0;
        for (int i = 0; i < grid.length; i++) {
            System.out.println("Box " + i);
            firstOccuranceIndex = firstOccurance(grid[i]);
            System.out.print("First Occurance " + firstOccuranceIndex);
            if (firstOccuranceIndex == -1) {
                System.out.println("; Count " + count);
                System.out.println("------------------------------");
                continue;
            }

            count = count + (grid[i].length - firstOccuranceIndex);
            System.out.println("; Count " + count);
            System.out.println("------------------------------");
        }
        return count;
    }

    public static int firstOccurance(int[] eachRow) {
        int start = 0, end = eachRow.length -1, firstOccurance = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (eachRow[mid] >= 0){
                start = mid + 1;
                System.out.println("(> 0) --> Mid " + mid + " & " + "element " + eachRow[mid]);
            }

            else if (eachRow[mid] < 0) {
                firstOccurance = mid;
                System.out.println("(< 0) --> Mid " + mid + " & " + "element " + eachRow[mid]);
                end = mid - 1;
            }
            else {
                start = mid + 1;
                System.out.println("(else) --> Mid " + mid + " & " + "element " + eachRow[mid]);
            }
        }
        return firstOccurance;
    }
}
