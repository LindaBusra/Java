package JavaLessons.day24_interfaces;

public class DifferencesAbstractClassAndInterfaces {

    /*

    What are the diff. between abstract classes and interfaces?

    1) Methods:
    a)"abstract class" can have both "abstract" and "concrete" method.
       "interfaces" can have just "abstract methods".
       Note: We can create methods with body by using static and default

    b) Methods in abstract classes can use any access modifier.
       Methods in interfaces are definitely public.

     2) Variables: i) "abstract class" can have every type of variable.
                     "interface" can have only "public", "static" and "final" variables.
                     Note: Variables are final in interface, because of that they must be initialized.
    Variables may or may not be final in abstract classes, because of that it is not mandatory to initialize.
    3) Note: By the help of the "interfaces" we can create "multiple parents" for a class.
              When you use "abstract class" it is impossible to create "multiple parents"
    4) Class "extends" class, Interface "extends" Interface, Class "implements" Interface, Interface can NOT be "child of a class".

-------------------------------------------------------------------------------------------------------------------------

    What do you know about "Collections"?

    Collections have 3 interfaces==> 1-Lists==>a-array lists and Linked lists//LinkedLists have 3 parent classes : List, Queue and Deque
                                     2-Queues===>a- Priority queue (concrete) b-Deque (interface)
                                     3-Sets=>a- HAshSet (concrete class)
                                             b- LinkedHashSet (concrete class)
                                             c-Sorted interface
                                             d-TreeSet (concrete class under Sorted interface)

      When do we use Linked List and ArrayList? Why?
      When do we use HashSet and LinkedHashSet? why?
      when to use which one?
     */
}
