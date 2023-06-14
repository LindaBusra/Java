package Batch159.day25_inheritance_overriding;

public class VehicleRunner {

    public static void main(String args[]) {

        //There is no return type in the constructors. Constructor name is the same with class name

        Civic myCivic= new Civic(true);

        myCivic.brake();
        myCivic.engine();
        myCivic.ecoSystem();
        int hashCode= myCivic.hashCode();   // it is coming from java.lang.Object, Object class which is parent of all classes
                                            //it is created in our local PC.
        System.out.println("hashCode = " + hashCode);

        Accord myAcc= new Accord();

        myAcc.turboSystem();
        myAcc.brake();
        myAcc.move();

    }


    //https://lms.techproeducation.com/mod/book/view.php?id=6589&chapterid=26509  38.08

}
