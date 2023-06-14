package Others.OCA.abiten.Q087;

public class MarkList {

    int num;

    public static void graceMarks(MarkList obj4) {

        obj4.num += 10;
    }

    public static void main(String[] args) {

        MarkList obj1 = new MarkList();
        MarkList obj2 = obj1;
        MarkList obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);
    }




}


    /*
    How many MarkList instances are created in memory at runtime?
    A. 1
    B. 2
    C. 3
    D. 4
    Answer: A
     */



//Objects in Java can only be instantiated with the new operator.
//MarkList obj1 = new MarkList();  As you can see, you allocate only one, and you get a pointer for it. Then you just make a second variable that stores a pointer, and that pointer points to the instance you allocated above.
//Since the keyword new, marking the call of a constructor, is only seen ONCE in the example code and the position of the constructor call is not inside a loop or a method which is called multiple times, it is safe to say that only ONE instance is created.

/*
Only one instance is created, but it is referenced three times.

The instance is created here:

MarkList obj1 = new MarkList();
And referenced by obj1:

MarkList obj1 = new MarkList();
obj2:
MarkList obj2 = obj1;

And object4
graceMarks(obj2);
 */