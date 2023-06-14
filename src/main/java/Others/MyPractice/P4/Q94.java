package Others.MyPractice.P4;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Q94 {

    public static void main(String[] args) {




    /*    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
        on the outside and the longer string on the inside. The strings will not be the same length, but
        they may be empty (length 0).
        comboString("Hello", "hi") → "hiHellohi"
        comboString("hi", "Hello") → "hiHellohi"
        comboString("aaa", "b") → "baaab"   */

        comboString("Hello", "hi");
        comboString("hi", "Hello");
        comboString("aaa", "b");


    }

    public static void comboString(String a, String b) {

        if (b.length() < a.length()) {
            System.out.println(b + a + b);
        } else if (a.length() < b.length()) {
            System.out.println(a + b + a);
        } else {
            System.out.println("The strings will not be the same length");
        }
    }
}