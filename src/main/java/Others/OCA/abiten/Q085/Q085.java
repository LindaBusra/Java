package Others.OCA.abiten.Q085;

class MyException extends RuntimeException {}

public class Q085 {


    public static void main(String[] args) {

        try {
            method1();
        }
        catch (MyException ne) {
            System.out.print("A");
        }
    }

    public static void method1() {          // line n1
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        }
        catch (RuntimeException re) {
            System.out.print("B");
        }
    }

}

//What is the result?
//A. A
//B. B
//C. Either A or B
//D. A B
//E. A compile time error occurs at line n1



/*
Direct Known Subclasses of RuntimeException:

 AnnotationTypeMismatchException, ArithmeticException, ArrayStoreException, BufferOverflowException, BufferUnderflowException,
 CannotRedoException, CannotUndoException, ClassCastException, CMMException, ConcurrentModificationException,
 DataBindingException, DOMException, EmptyStackException, EnumConstantNotPresentException, EventException,
 FileSystemAlreadyExistsException, FileSystemNotFoundException, IllegalArgumentException, IllegalMonitorStateException,
 IllegalPathStateException, IllegalStateException, IllformedLocaleException, ImagingOpException, IncompleteAnnotationException,
 IndexOutOfBoundsException, JMRuntimeException, LSException, MalformedParameterizedTypeException, MirroredTypesException,
 MissingResourceException, NegativeArraySizeException, NoSuchElementException, NoSuchMechanismException, NullPointerException,
 ProfileDataException, ProviderException, ProviderNotFoundException, RasterFormatException, RejectedExecutionException,
 SecurityException, SystemException, TypeConstraintException, TypeNotPresentException, UndeclaredThrowableException,
 UnknownEntityException, UnmodifiableSetException, UnsupportedOperationException, WebServiceException, WrongMethodTypeException

 */
