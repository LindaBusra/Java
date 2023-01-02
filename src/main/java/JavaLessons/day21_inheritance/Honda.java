package JavaLessons.day21_inheritance;




public class Honda extends Car {

    public void hondaMake(){
        System.out.println("This car was made Honda factory");

    }

    public Honda() {
        System.out.println("Honda class constructor 1");
    }

    public Honda(boolean isNew) {
        super("Hybrid");
        if(isNew) {
            System.out.println("Brand new");
        }else{
            System.out.println("Used");
        }



    }

}
