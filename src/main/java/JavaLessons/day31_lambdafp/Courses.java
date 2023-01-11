package JavaLessons.day31_lambdafp;

public class Courses {

    //If something is hidden, I will be reach out the these data by using getter and setter.  if we want to change data--> private
    private String Season;          //
    private String courseName;
    private int averageScore;
    private int numberOfStudents;


    //1)Constructor without parameter
    public Courses() {
    }


    //2)Constructor with all parameters
    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        Season = season;  //
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }


    //3)getters() and setter()  //to get the name of hidden variable we use getter and setter

    public String getSeason() {

        return Season;
    }

    public void setSeason(String season) {

        Season = season;
    }

    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }

    public int getAverageScore() {

        return averageScore;
    }

    public void setAverageScore(int averageScore) {

        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {

        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {

        this.numberOfStudents = numberOfStudents;
    }



    //4)toString()  -->without that, I can get just the references of the data.
    //If I want to see my data on the console as a String data I have to use toString().
    @Override
    public String toString() {
        return "Course: Season=" + Season + ", courseName=" + courseName + ", averageScore=" + averageScore
                + ", numberOfStudents=" + numberOfStudents;
    }

}