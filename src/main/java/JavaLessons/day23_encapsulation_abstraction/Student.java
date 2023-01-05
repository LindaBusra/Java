package JavaLessons.day23_encapsulation_abstraction;

public class Student {

    public String name = "Tom Hanks";
    private String stdId = "TH123";
    private double stdGpa = 3.8;

    private String disease = "Heart Disease";

    boolean successfull = false;


    public String getStdId() {              //naming convention-->we use same name before get
        return stdId;
    }

    public double getStdGpa() {
        return stdGpa;
    }

    public String getDisease(){
        return disease;
    }

    //If the data type is "boolean" get method name starts with "is"
    public boolean isSuccessful(){
        return successfull;
    }

    //Everytime set() method return type will be "void" because set() method will do just an action. Tt will change the data.
    public void setDisease(String disease) {
        this.disease = disease;
    }

    //Even the date type is boolean we use "set" at the beginning of the name.
    public void setStdGpa(double stdGpa) {
        this.stdGpa = stdGpa;
    }


    public void setSuccessfull(boolean successfull) {
        this.successfull = successfull;
    }


    public static void main(String[] args) {




    }
}
