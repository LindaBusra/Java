package JavaLessons.day08_forloop;

public class ForLoop08 {

    public static void main(String[] args) {


        //for loop for two paramaters

        for(int j=0, k=0; j<11 && k<5; j++, k++){

            System.out.print("j:" + j + " k:" + k + ", ");
        }
        System.out.println();




        //two for loop

        for(int m=0; m<5; m++)  {
            for(int h=0; h<5; h++) {

                System.out.print(m+h + " ");
            }
        }



        //two while loop

        int a= 0;
        int b=0;

        while(a<5) {
            b=0;
            while(b<5) {

                System.out.println("a:" + a + " b:" +b);
                b++;
            }
            a++;
        }

    }
}
