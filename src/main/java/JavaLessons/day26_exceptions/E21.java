package JavaLessons.day26_exceptions;

public class E21 {
    public static void main(String[] args) {



        try{
            num(-3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public  static void num(int x){

        if(x<-1 || x>10) {

            throw new IllegalArgumentException("I dont want it");
        } else {
            System.out.println(x);
        }
    }
}
