package JavaLessons.day06_methods_recursion;

public class Method06 {

    public static void main(String[] args) {

        //Find the sum of digits


        System.out.println(getSUM(2453));
        System.out.println(sumOfDigits(2453));
        getSumOfDigits(2453);

    }



    static int getSUM(int num){

        String a = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < a.length(); i++){
            sum += Integer.valueOf(a.charAt(i) + "");
        }
        return sum;
    }


    static void getSumOfDigits(int num){

        String a = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < a.length(); i++){
            sum += Integer.valueOf(a.charAt(i) + "");
        }
        System.out.println("The sum of digits:" + sum);
    }


    public static int sumOfDigits(int a){

        String str =String.valueOf(a);
        int sum = 0;

        for(int i=0; i<str.length(); i++) {

            sum = (int) (sum + (a/Math.pow(10,i))%10);
        }
        return sum;
    }
}
