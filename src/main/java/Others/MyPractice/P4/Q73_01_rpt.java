package Others.MyPractice.P4;

public class Q73_01_rpt {

    public static void main(String[] args) {

       /*
       Find the occurance of the each character in given string.
       Test1 data:
       Input = AAABBCDD
       Output = A3B2C1D2
        */



       //1.way
        String str = "AAABBCDD";

        frequency(str);




        //2.way
        String arr[] =  str.split("");
        String temp = "";

        for(int i=0; i<arr.length; i++) {

            int count = 0;

            for(int j=0; j<arr.length; j++) {

                if(arr[i].equals(arr[j])) {

                    count++;
                }
            }

            if (!temp.contains(arr[i])) {
                temp += arr[i] + count;
            }
        }
        System.out.println(temp);
    }




    private static void frequency(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {

                    count++;
                }
            }
            if (!output.contains(str.substring(i, i + 1))) {
                output += str.substring(i, i + 1) + count;
            }
        }
        System.out.println(output);


    }
}
