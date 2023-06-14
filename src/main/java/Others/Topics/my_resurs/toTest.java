package Others.Topics.my_resurs;

public class toTest {
    public static void main(String[] args) {

//        int a = 5;
//        System.out.println(Integer.toBinaryString(a));

 //Ask user to enter any name of the week, then get second, forth, and sixth letter of the day name and print them
// on the console, in the sam line. For example, if the user enters "Monday" output will be "ody"

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any name of the week");
//        String day = scan.next();
//
//        System.out.println(day.substring(1,2)+day.substring(3,4)+day.substring(5,6));





 //Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34


//        int n=10, firstTerm = 0, secondTerm = 1;
//
//
//        for (int i = 1; i<=n ; i++) {
//            System.out.print(firstTerm + ", ");
//            int nextTerm = secondTerm + firstTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//
//        }


//Fibonacci with while
//        int i=1, n=10, firstTerm = 0, secondTerm = 1;
//
//
//        while (i<=n) {
//            System.out.print(firstTerm + ", ");
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//            i++;
//
//        }




//        String s = " Miami33018!!! ";
//        int numOfChars = s.replaceAll(" ", "").
//                replaceAll("[^a-zA-Z0-9]", "").length();
//        System.out.println(numOfChars);   //10





//Question 2-  Type code to print repeated characters in a String. For example; accessories ⇒ ces

//        String str = "accessories";
//        String temp = "";
//
//        for(int i=0; i<str.length(); i++){
//
//            String ch = str.substring(i,i+1);
//            if(str.indexOf(ch)!=str.lastIndexOf(ch)){
//                if(!temp.contains(ch)){
//                    temp = temp + ch;
//                }
//            }
//        }
//        System.out.println("Repeated characters in this string: " + temp);



// /*Example 15: Type a program like; Ask user to enter two integer values, the first will be greater than the second.
//              The remainder when you divide the first by the second will be the width, and the sum of the two numbers
//              will be the length of a rectangle. Then calculate the area and the perimeter of the rectangle, and print them
//              on the console.*/



//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int num1 = scan.nextInt();
//
//        System.out.println("Enter the second number");
//        int num2 = scan.nextInt();
//
//        int width = num1 % num2;
//        int length = num1 + num2;
//
//        if(num1>num2) {
//            System.out.println("The area of the rectangle is " + (width*length));
//            System.out.println("The perimeter of the rectangle is " + (2*width+2*length));
//        } else {
//            System.out.println("invalid input");
//        }


//Type code to print integers from 3 to 9, except 5
        int a =3;

        do {
            if( a!= 5 ) {
                System.out.println(a);
            }
        a++;

        }    while(a <10);



    }}
