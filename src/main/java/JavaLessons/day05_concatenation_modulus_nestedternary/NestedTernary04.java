package JavaLessons.day05_concatenation_modulus_nestedternary;

public class NestedTernary04 {

    public static void main(String[] args) {




//Question 1- What is the result?

        int i=5;
        System.out.println(i>2 ? i<4 ? 10 : 8 : 7);



//Question 2- What is the result?

        int x =5 ;

        System.out.println(x<2 ? (x <4 ? 10 : 8) : 7 );




//Question 3- What is the result?

        int y =5 ;

        System.out.println(y>2 ? y <9 ? y <6 ? y >10 ? 10 : -2 :  8 : 7  : 20);
    }
}
