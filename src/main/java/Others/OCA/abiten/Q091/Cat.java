package Others.OCA.abiten.Q091;

import java.util.ArrayList;

public class Cat extends Animal implements Hunter{


    public static void main(String[] args) {


        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(new Tiger());

        ArrayList<Hunter> myList1 = new ArrayList<>();
        myList1.add(new Cat());

        ArrayList<Hunter> myList2 = new ArrayList<>();
        myList2.add(new Tiger());

        ArrayList<Tiger> myList3 = new ArrayList<>();
//        myList3.add(new Cat());

        ArrayList<Animal> myList4 = new ArrayList<>();
        myList4.add(new Cat());



        /*
A. Option A
B. Option B
C. Option C
D. Option D
E. Option E
Answer: D
         */
    }
}
