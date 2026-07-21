package Array;

public class Test_CharArray {

    public static void main(String[] args) {

        char[] s = {'a', 'b', 'c', 'd'};

        System.out.println(s[0]);

       System.out.println("           ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(i + " = " + s[i]);
        }

        System.out.println("           ");
        for (char a : s) {
            System.out.println(a);
        }
    }
}