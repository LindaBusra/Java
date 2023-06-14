package Others.Topics.OverloadingExample;

public class Q02_CalculateVolumeOfCube {


    public static void main(String[] args) {

////Create a method to calculate volume of cube, square prism and rectangular prism.





    }

    public double volumeOfCube(double a) {

        return a*a*a;
    }


    public static double volumeOfSquarePrism(double a, double h) {

            return a*a*h;
    }

    public static double volumeOfRectangularPrism(double a, double b, double h) {

        return a*b*h;
    }


    //final, static can be overloaded, but can not  be overriding

    }
