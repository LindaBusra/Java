package Others.MyPractice.P2;

public class Q28 {


    public static void main(String[] args) {


        //What is the output?


        for(int x = 1; x<6; x++){

            switch(x){

                case 1:

                    System.out.print(x);
                    x++;

                case 2:

                    System.out.print(x);
                    x++;   //X=3
                    break;

                case 3:

                    System.out.print(x);
                    x+=2;
                    break;

                default:
                    System.out.print(" Done!");
            }
        }
    }
}
