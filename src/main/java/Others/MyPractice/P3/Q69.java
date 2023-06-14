package Others.MyPractice.P3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q69 {

    public static void main(String[] args) {

        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
        //    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        //    s -> 5
        //    a -> 4
        //    e -> 3
        //    i -> 1
        //    o -> 0
        //    Test1 data
        //    hackerDili("java ile hersey guzel")
        //    j4v4 1l3 h3r53y guz3l
        //    İpucu harfleri değiştirin ve ekrana yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string please");
        String str = scan.nextLine();

        hackerConversation(str);


        }

        public static  void hackerConversation(String str) {

            str = str.toLowerCase().replaceAll("s","5").
                    replaceAll("a","4").replaceAll("e","3").
                    replaceAll("i","1").replaceAll("o","0");

            System.out.println(str);

        }
    }
