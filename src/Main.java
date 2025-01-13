import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(kaprekar(1000));
    }
    public static int sortNumberDescending(int n) {
        String nValues = Integer.toString(n);
        char[] nArray = nValues.toCharArray();
        Arrays.sort(nArray);
        StringBuilder sb = new StringBuilder(new String(nArray));
        sb.reverse();
        int thing = Integer.parseInt(sb.toString());
        if (thing < 1000) {
            return thing * 10;
        }
        return thing;
    }
    public static int sortNumberAscending(int n) {
        String nValues = Integer.toString(n);
        char[] nArray = nValues.toCharArray();
        Arrays.sort(nArray);
        StringBuilder sb = new StringBuilder(new String(nArray));
        return Integer.parseInt(sb.toString());
    }
    public static int kaprekar(int n) {
        int count = 0;
        while (n != 6174) {
            int asc = sortNumberAscending(n);
            int desc = sortNumberDescending(n);
            n = desc - asc;
            count++;
        }
        return count;
    }
    public static int kaprekarRecursive(int n) {
        if (n == 6174) {
            return 0;
        }
        int asc = sortNumberAscending(n);
        int desc = sortNumberDescending(n);
        return 1 + kaprekarRecursive(desc - asc);
    }
}