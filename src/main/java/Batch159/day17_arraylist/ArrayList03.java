package Batch159.day17_arraylist;

import java.util.ArrayList;

public class ArrayList03 {

    public static void main(String[] args) {

//Example 3: Type code to find the sum of the elements if they are different from 31 and 54
//           [12, 31, 15, 32, 54] ==> 12 + 15 + 32 = 59

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(31);
        nums.add(15);
        nums.add(32);
        nums.add(54);


        int s = 0;
        for(Integer w: nums) {

            if(w==31 || w==54) {

                continue;
            }

            s += w;
        }

        System.out.println("the sum of the elements :" + s);




        //2nd. way

        int sum=0;

        for(Integer w:nums) {

            if(w!=31 && w!=54)  {

                sum+=w;
            }
        }

        System.out.println("the sum of the elements :" + sum);


//Example 3: Type code to check if all elements are unique or not in a list
//           [12, 31, 15, 32, 54] ==> 12 + 15 + 32 = 59

        ArrayList<Integer> n = new ArrayList<>();
        n.add(12);
        n.add(31);
        n.add(12);
        n.add(32);
        n.add(54);


        int counter = 0;
        for(Integer w : n) {

            if(n.indexOf(w)!=n.lastIndexOf(w)) {

                System.out.println("All elements are not unique");
                break;
            } else {
                counter++;
            }
        }

        if(counter==n.size()) {
            System.out.println("All elements are unique");
        }




        //find the unique elements
        ArrayList<Integer> n2 = new ArrayList<>();

        for(Integer w : n) {

            if(!n2.contains(w)) {

                n2.add(w);
                System.out.print(w + " ");
            }
        }






    }
}
