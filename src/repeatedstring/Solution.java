package repeatedstring;

public class Solution {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }

    static long repeatedString(String s, long n) {
        long aInInitialString = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                aInInitialString++;
            }
        }

        final long sizeOfString = s.length();
        final String sLeft = s.substring(0, (int) (n % sizeOfString));
        System.out.println("SUB-STRING LEFT TO BE ADDED: " + sLeft);

        long aInLeftString = 0;
        for (char c : sLeft.toCharArray()) {
            if (c == 'a') {
                aInLeftString++;
            }
        }

        return aInInitialString * (n / s.length()) + aInLeftString;
    }
}
