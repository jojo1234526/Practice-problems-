import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 1, 2};
        System.out.println(Arrays.toString(findDistances(arr)));
    }

    public static int[] findDistances(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if ((!map.containsKey(arr[i]))) {
                map.put(arr[i], new ArrayList<>());
                System.out.println("After inserting " + arr[i] + ": " + map);

            }

            for (int index : map.get(arr[i])) {
                result[i] += Math.abs(i - index);
                result[index] += Math.abs(i - index);
                System.out.println("After processing pair (i, index) = (" + i + ", " + index + "): " + Arrays.toString(result));

            }
            map.get(arr[i]).add(i);
            System.out.println("After adding index " + i + " to list for " + arr[i] + ": " + map);

        }
        return result;
    }
}
