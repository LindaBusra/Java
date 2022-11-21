package JavaLessons.day01_variables;

public class AsciiTable {
    public static void main(String[] args) {


        int num=10;
        char ch='a';

        System.out.println(num+ch);   // 10+97=100


        System.out.println(num*ch);   //10*97=907

        String str="banan";
        System.out.println(str+ch);
        System.out.println(ch+2);
        System.out.println(str+num+ch);

        System.out.println(""+num+ch);   //10a


        char value='1';
        System.out.println(value+ch); // '1'+'a' ---> 49+97=146

        char result='a';
        System.out.println(result);                     //a
        System.out.println(num+result);             //10+97=107
        System.out.println("banan"+result);        //banana
        System.out.println(result*2);           //97*2=194
        System.out.println(""+num+result);          //10a


        // From String to integer
        String number = "3";
        int r1 = Integer.valueOf(number);
        int r2 = Integer.parseInt(number);  //it is faster




    }
}
