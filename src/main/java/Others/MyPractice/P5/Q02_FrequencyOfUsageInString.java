package Others.MyPractice.P5;

public class Q02_FrequencyOfUsageInString {

    public static void main(String[] args) {


/*
Count the frequency of the letters in a given String as the format below:
Input: String str = "Java is so Good";
Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
 */

    String str = "Java is so Good";
    str = str.replaceAll(" ", "");
    String output = "";


    for(int i=0; i<str.length(); i++) {         //This loop is to take the letters one by one

        int counter = 0;
        for(int j=0; j<str.length(); j++) {     //This loop is for checking if they are same or not

            if(str.charAt(i)==str.charAt(j))  {

                counter++;

            }

        }
        if(!output.contains(String.valueOf(str.charAt(i)))) {            //If they are not same characters,
            output = output + str.charAt(i) + counter + " " ;
        }
    }
        System.out.println(output);//J1a2v1 3i1s2o3G1d1








    }
}
