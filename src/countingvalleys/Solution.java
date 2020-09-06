package countingvalleys;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    static int countingValleys(int n, String s) {
        final List<Integer> steps = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == 'U') {
                steps.add(1);
            } else {
                steps.add(-1);
            }
        }

        int result = 0;
        int currentLevel = 0;

        for (Integer step : steps) {
            currentLevel = currentLevel + step;
            if (currentLevel == 0 && step > 0) {
                result++;
            }
        }
        return result;
    }
}