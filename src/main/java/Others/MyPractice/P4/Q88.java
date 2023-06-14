package Others.MyPractice.P4;

public class Q88 {
    public static void main(String[] args) {




// Example - Type code to check if a given String is palindrome or not


        String text = "RadaR";

        String tem = "";

        //with for
        for(int i=text.length()-1; i>=0; i--) {
            tem = tem + text.charAt(i);
        }

        if(text.equals(tem)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }


        //2. way:

        String str1="Nalan";
        String reversed= "";

        int idx=str1.length()-1;

        while (idx>-1){

            reversed= reversed+str1.charAt(idx);

            idx--;
        }
        if (str1.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }



    }
}
