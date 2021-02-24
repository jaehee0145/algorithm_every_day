package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians),
// return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.
//
//A row i is weaker than row j, if the number of soldiers in row i is less than the number of soldiers in row j,
// or they have the same number of soldiers but i is less than j. Soldiers are always stand in the frontier of a row,
// that is, always ones may appear first and then zeros.
//
//Example 1:
//
//Input: mat =
//[[1,1,0,0,0],
// [1,1,1,1,0],
// [1,0,0,0,0],
// [1,1,0,0,0],
// [1,1,1,1,1]],
//k = 3
//Output: [2,0,3]
//Explanation:
//The number of soldiers for each row is:
//row 0 -> 2
//row 1 -> 4
//row 2 -> 1
//row 3 -> 2
//row 4 -> 5
//Rows ordered from the weakest to the strongest are [2,0,3,1,4]
public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            map.put(i, count);
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(m -> list.add(m.getValue()));
        System.out.println(list);
        Integer[] answer = new Integer[k];
        list.toArray(answer);
        int[] answer1 = new int[k];
        System.out.println("test");
        System.out.println(Arrays.asList(answer));
        for (int i = 0; i <k ; i++) {
            answer1[i] = answer[i];
        }
        return answer1;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        TheKWeakestRowsInAMatrix t = new TheKWeakestRowsInAMatrix();
        int[] ints = t.kWeakestRows(arr, 3);
        System.out.println(Arrays.toString(ints));

    }
}
