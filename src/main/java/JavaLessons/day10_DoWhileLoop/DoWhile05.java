package JavaLessons.day10_DoWhileLoop;

public class DoWhile05 {

    public static void main(String[] args) {


          /*
        create one int
        do while int is less than 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */


        int m = 0;

        while(m<100){

            System.out.print(m+ " ");
            m +=5;



//----------------------------------------------------------------------


            int i=1;

            do{

                if(i==3) {
                    continue;
                } else if(i==5) {
                    System.out.print(i + " ");
                    break;
                } else {
                    System.out.println(i + " ");
                }
                i++;
            } while(true);

        }
    }
}
