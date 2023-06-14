package JavaLessons.day10_dowhileloop;

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

        int i2=0;

        do{

            System.out.println(i2);
            i2 += 5;
        }while(i2<100);


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

