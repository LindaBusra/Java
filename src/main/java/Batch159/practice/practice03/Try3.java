package Batch159.practice.practice03;

public class Try3 {

    public static void main(String[] args) {


        //If the following codea are printed inside the main method, which ones are false
        //a
        m1(33);         //Auto-widening, float accept int

        //b
        m1(33,44);      //int, double accept int : Auto-widening

        //c
//        m1(33.3, 44);     //int does not accept double

        //d
//        m1(33.3);         //float does not accept double




    }

    public static  void m1(float x){

        System.out.println("Method 1");
    }

    public static  void m1(int x, double y){

        System.out.println("Method 2");
    }
}
