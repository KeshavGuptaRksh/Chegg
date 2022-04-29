import java.util.StringTokenizer;

/**
 * Homework6Methods
 */
public class Homework6Methods {

    public static int getMaxOf2Ints(int num1, int num2) {
        return (Math.max(num1, num2));
    }

    public static int getMinOf2Ints(int num1, int num2) {
        return (Math.min(num1, num2));
    }

    public static int getMaxOf3Ints(int num1, int num2, int num3) {
        num1 = Math.max(num1, num2);
        num2 = Math.max(num1, num3);
        return (num3);
    }

    public static int MedianOf3Ints(int num1, int num2, int num3) {
        if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1))
            return num2;
        else if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2))
            return num1;
        else
            return num3;
    }

    public static void getMinOf3Ints(int num1, int num2, int num3) {
        num1 = Math.min(num1, num2);
        num2 = Math.min(num1, num3);
        System.out.println("The min is " + num2);
    }

    public static int getProdOfAllPositiveInts(int num) {
        int p = 1;
        if (num <= 0)
            return 0;
        else {
            for (int i = 1; i <= num; i++)
                p *= i;
            return p;
        }
    }

    public static int getProdOfAllNegativeInts(int num) {
        int p = 1;
        if (num >= 0)
            return 0;
        else {
            for (int i = num; i <= -1; i++)
                p *= i;
            return p;
        }
    }

    public static boolean isProdOfAllNegativeIntsNegative(int num) {
        if (getProdOfAllNegativeInts(num) < 0)
            return true;
        else
            return false;
    }

    public static char getCharAtIndex(String s, int index) {
        if (index >= 0 && index <= s.length())
            return s.charAt(index);
        else
            return '?';
    }

    public static int getCountOfCharInString(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static String getStringReversed(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void getStringTitleCased(String s) {
        String s2 = "";
        char w;
        String words[] = s.split(" ");
        for (String str : words) {
            s2 = "";
            w = str.charAt(0);
            w = Character.toUpperCase(w);
            s2 = w + str.substring(1);
            System.out.print(s2 + " ");
        }

    }

    public static void main(String[] args) {
        System.out.println(getMaxOf2Ints(3, 5));
        System.out.println(getMinOf2Ints(3, 5));
        System.out.println(getMaxOf3Ints(3, 2, 5));
        System.out.println(MedianOf3Ints(20, 30, 40));
        getMinOf3Ints(3, 2, 5);
        System.out.println(getProdOfAllPositiveInts(5));
        System.out.println(getProdOfAllNegativeInts(-5));
        System.out.println(isProdOfAllNegativeIntsNegative(-5));
        System.out.println(getCharAtIndex("Hello How are you", 200));
        System.out.println(getCountOfCharInString("Hello How are you", 'a'));
        System.out.println(getStringReversed("Hello How are you"));
        getStringTitleCased("Hello How are you");
    }

}