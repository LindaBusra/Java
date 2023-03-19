package JavaLessons.day01_variables;

public class Conversion {

    public static void main(String[] args) {



        // from char-->to integer,  from integer-->to char

        char c =67;
        System.out.println("My character:" + c);        //My character:C

        char d = 68;
        System.out.println(d);  //D
        System.out.println("d" + d);  //dd
        System.out.println(d + 2);  //68 + 2 = 70


        char ch = 'B';
        int bb =Integer.valueOf(ch);
        System.out.println(bb);         //66

        int sayi = 68;
        System.out.println((char)sayi);  //D



// 2 way to convert char to integer

        char aa = 'a';
        int ch1 = (char)ch;    // or int ch1 = 'B';
        System.out.println(ch1);        //66
        int ch2 = Integer.valueOf(aa);
        System.out.println(ch2);        //97




// 3 way to convert integer to String
        int num = 5;


        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);
        String str3 = "" + num;



// 2 way for convert String to integer

        String rk = "3";
        int r1 = Integer.valueOf(rk);
        int r2 = Integer.parseInt(rk);  //it is faster



//     from double-->to integer

        double doubleNum= 13.1333d;
        int d1 = (int)doubleNum;

        System.out.println(d1);     //13




        //     from  float-->to long
        float floatNum = 112.153f;
        long longSayi = (long) floatNum;


//      from int-->to double
        int intNum1 = 151;
        double doubleNum1 = (double) intNum1;


//       from long-->to float
        long longSayi1 = 1234567890;
        float floatSayi1 = (float) longSayi1;




        //How to get the minimum and maximum values of numeric data types in java

        System.out.println(Integer.MAX_VALUE);   //2147483647
        System.out.println(Integer.MIN_VALUE);  //2147483648

        System.out.println(Byte.MAX_VALUE);   //127
        System.out.println(Byte.MIN_VALUE);  //-128

        System.out.println(Character.MAX_VALUE);   //￿
        System.out.println(Character.MIN_VALUE);  //￿




        //Example- Create a char variable and integer variable and try to the addition operating with them

        int number  = 10;
        char character = 'a';
        System.out.println(number+character);   // a=97 + 10 =107


        int i1 = 10;
        char c1 = 'A';
        System.out.println(c1+i1);    // 65 +10 =75

    }
}
