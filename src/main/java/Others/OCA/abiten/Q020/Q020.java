package Others.OCA.abiten.Q020;

public class Q020 {

    int a1;
    public static void doProduct(int a) {
        a = a * a;
    }


    public static void doString(String s) {
        s.concat(" " + s);
    }


    public static void main(String[] args) {

        Q020 item = new Q020();
        item.a1 = 11;
        String sb = "Hello";
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+ " " + sb + " " + item.a1);
    }
}
//What is the result?
//A.	10 Hello Hello 11
//B.	10 Hello Hello 121
//C.	100 Hello 121
//D.	100 Hello Hello 121
//E.	10 Hello 11

//https://github.com/eadamceylan/OCA_2022_Preparation_all_questions-/blob/main/src/test/java/q020/Test.java
