package jumpingclouds;

public class Solution {

    public static void main(String[] args) {
        System.out.println("RESULT: " + jumpingOnClouds(new int[] {0, 0, 0, 1, 0, 0}));
    }

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;

        while (i < c.length - 1) {
            System.out.print("Jump from: " + i);
            if (i + 2 == c.length || c[i+2] == 1) {
                i++;
            } else {
                i += 2;
            }
            System.out.println(" to " + i);
            jumps++;
            System.out.println("Jumps = " + jumps);
        }

        System.out.println();
        return jumps;
    }
}
