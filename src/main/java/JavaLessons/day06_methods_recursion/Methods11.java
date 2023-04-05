package JavaLessons.day06_methods_recursion;

public class Methods11 {

    public static void main(String[] args) {

        int[][] x = { {2,1}, {1,7,1}};

        int[] y = {3,6,8};

        System.out.println(sumOfArrayElements(x[1]));
        System.out.println(sumOfArrayElements(y));


    }



    public static int sumOfArrayElements(int[] m) {               //  int[] m = x[1] ={1,7,1}
        int result = 0;

        for(int i=0; i<m.length; i++) {   //i=0  i<3
            result += m[i];                 //i=0   result =0+m[0]=0+1=1
                                            //i=1  result = 1 + m [1] = 1+7=8
                                            //i=2  result = 8 + m[2] = 8+1 = 9
        }
        return result;
    }
}













/*int[] m = x[1];      int m = {1,7,1,};

i=0-->result = 0+ m[i]-->0 + m[0] -->0 + 1 = 1
i=1 -->result = 1+ m[1] + 1+ 7=8
i=2; -->result = 8 +m[2] = 8 + 1 =9







 */
