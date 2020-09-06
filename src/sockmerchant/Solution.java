package sockmerchant;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    static int sockMerchant(int n, int[] ar) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int e : ar) {
            if (map.get(e) == null) {
                map.put(e, 1);
            } else {
                map.put(e, map.get(e) + 1);
            }
        }

        int result = 0;
        for (int val : map.values()) {
            result += val /2;
        }

        return result;
    }
}
