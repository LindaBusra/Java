package JavaLessons.day01_variables;

public class AsciiTable {
    public static void main(String[] args) {



        int num=10;
        char ch='a';

        System.out.println(num+ch);  //10+97=107


        System.out.println(num*ch); //970

        String str="banan";
        System.out.println(str+ch);   //banana
        System.out.println(ch+2);   //99
        System.out.println(str+num+ch);  //banan10a

        System.out.println(""+num+ch);   //10a


        char value='1';  //        System.out.println(value + 0); -->ascii 49

        System.out.println(value+ch);   //49+97 = 146

        char result='a';
        System.out.println(result);  //a
        System.out.println(num+result); //107
        System.out.println("banan"+result);  //banana
        System.out.println(result*2);   //97*2=194
        System.out.println(""+num+result);  //10a


        char cc = 'a';
        System.out.println(String.valueOf(cc));

        // From String to integer
        String number = "3";
        int r1 = Integer.valueOf(number);
        int r2 = Integer.parseInt(number);  //it is faster





    }
}
