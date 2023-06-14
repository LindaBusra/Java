package Others.OCA.abiten.Q206;

public class Q206 {


    public static void main(String[] args) {

        //Given the code fragment:

        int a[] = {1,2,3,4,5};

//    for(xxx) {
//        System.out.print(a[e]);
//    }

        for(int e=0; e<5; e+=2) {

            System.out.print(a[e]);
        }

    }
}

/*
which option can replace xxx to enable the code to print 135?

A  int e=0; e<=4; e++
B  int e=0; e<5; e+=2  +
C  int e=1; e<=5; e+=1
D  int e=1; e<5; e+=2

A. option A
B. option B
C. option C
D. option D

answer b
 */
