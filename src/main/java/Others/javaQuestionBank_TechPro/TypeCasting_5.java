package Others.javaQuestionBank_TechPro;

public class TypeCasting_5 {
    public static void main(String[] args) {

//boolean<char<byte<short<integer<long<float<double

//Q-1  Create a short variable and convert it to an int variable
        short age = 12;
        int newAge = age;
        System.out.println(newAge);  //12

//Q-2 Create a long variable and convert it to an int variable
        long age2= 12L;
        int newAge2 = (int) age2;
        System.out.println(newAge2);  //12

//Q-3 Create a double variable and convert it to a float variable
        double price = 2.34;
        float newPrice = (float)price;
        System.out.println(newPrice);   //2.34

//Q-4  Create a double variable and convert it to a short variable, then print the value of the short
//variable on the console. Be careful about the output, it will not be a decimal value.
        double price2 = 1.2;
        short newPrice2 = (short)price2;
        System.out.println(newPrice2);   // 1

//Q-5  Create a byte variable and convert it to a double variable, then print the value of the double
//variable on the console. Be careful about the output, it will be a decimal number.

byte age3 = 23;
double newAge3 = age3;
System.out.println(newAge3);   //23.0





















    }











}
