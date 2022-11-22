package JavaLessons.day01_variables;

public class DataTypes02 {

    public static void main(String[] args) {


        //Create 2 integer variables whose values are 5 and 2 then print the result of first is divided by second
        //If you use just "int" data type in mathematical operations the result will be in "int" data type.
        //In the result, Java will remove decimal part and return just the whole part
        int i = 5, k = 2;
        System.out.println(i/k);

        //When you use different data types in mathematical operations, the result will be in the largest type.
        //Because of that the result data type will be double.
        double m = 5;
        int n = 2;
        System.out.println(m/n);

        //In how many ways you can fix the following issue?
        //1.way:
        float z = 2.5F;
        //2.way:
        double r = 2.5;

        //What is the output of the followings?
        System.out.println(2+3+"Ole");      //5Ole

        System.out.println(2+'a'+"B"+(3+4));    //99B7
        //'a' char=97  it came from ASCCI table
    }
}
