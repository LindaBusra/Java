package JavaLessons.day06_methods;

public class Method06 {

    public static void main(String[] args) {

        //Find the sum of digits


        System.out.println(getSUM(2222));
    }



    static int getSUM(int num){

        String a = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < a.length(); i++){
            sum += Integer.parseInt(a.charAt(i) + "");
        }
        return sum;
    }
}
