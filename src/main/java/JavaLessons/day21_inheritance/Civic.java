package JavaLessons.day21_inheritance;




public class Civic extends Honda {


    public void ecoEngine(){
        System.out.println("Civic uses eco enginee...");
    }

    public Civic() {
        System.out.println("Civic class constructor 1");
    }

    public Civic(int year) {
        super(true);
        System.out.println(year);
    }


}
