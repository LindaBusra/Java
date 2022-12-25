package JavaLessons.day16_arraylist;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

   ////Create an integer ArrayList, then remove the forth element

        ArrayList<Integer>  a = new ArrayList<>();
        a.add(12);
        a.add(4);
        a.add(13);
        a.add(25);
        a.add(432);
        System.out.println(a);


        a.remove(3);
        System.out.println(a);



//-----------------------------------------------------------------------------

        ////Create an integer ArrayList, then remove the first occurrence of 4
        ArrayList<Integer>  f = new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);
        System.out.println(f);  //[12, 4, 13, 25, 432]



        //integer bir degeri koydugumda onu index gibi dusunmesin diye bu yolu kullandim
        f.remove(Integer.valueOf(4));
        System.out.println(f);              //[12, 13, 25, 432]


//Note: If you use Integer List element directly inside the remove() method lik remove(4), Java will accept it as index,
//      Because indexes are primitive integers, when you put 4, it will be accepted as primitive and it will be index.
//      Lists use non-primitives as list elements, therefore you have to convert primitive int to Integer.
//      To do that, use valueOf() method from Integer wrapper class

//Note:You will se "valueOf()" method in many classes.
//"valueOf()" method method changes the data type without changing the value.


//-----------------------------------------------------------------------------------


//Type code to check if a spesific element exist in the list or not

        ArrayList<Double> g = new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);


        boolean isExist = g.contains(5.02);

        System.out.println(isExist);            //true



//Type code to change the element at index 1 to 9.99


        ArrayList<Double> h = new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);
        System.out.println(h);      //[12.99, 5.02, 11.23]


        //Set() method is for updating an element by using index.
        h.set(1, 9.99);             // we use set() for change.
        System.out.println(h);      // [12.99, 9.99, 11.23]


//----------------------------------------------------------------------------------


//Example 8 : Type code to increase all salaries in an Integer list 10 percent


//set()-->update element
//get()-->for get spesific elemement with using index


        ArrayList<Double> sl = new ArrayList<>();
        sl.add(5000.0);
        sl.add(6000.0);
        sl.add(4500.0);
        sl.add(3900.0);
        sl.add(7200.0);
        System.out.println(sl);


       for(int i=0; i<sl.size(); i++) {

           sl.set(i, sl.get(i)*1.1);
       }
        System.out.println(sl);






    }
}
