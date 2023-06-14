package Batch159.day36_lambda;

public class Courses {

    /*
        If a Class has
            i)"private" variables
            ii)Constructor with all parameters
            iii)Constructor without any parameter
            iv)All getters and setters
            v)toString() method
        then it is called "POJO Class".
        POJO stands for "Plain Old Java Object"
     */

    private String courseName;
    private int numOfstudents;
    private String season;
    private double avgScore;


    //when we create this one, it will be remote the default constructor
    public Courses(String courseName, int numOfstudents, String season, double avgScore) {
        this.courseName = courseName;
        this.numOfstudents = numOfstudents;
        this.season = season;
        this.avgScore = avgScore;
    }

    public Courses() {
    }

    //getter and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfstudents() {
        return numOfstudents;
    }

    public void setNumOfstudents(int numOfstudents) {
        this.numOfstudents = numOfstudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }


    //ToString():if you want to see object details on the console when you print it, you should create toString() in your class.
    @Override
    public String toString() {
        return
                "CourseName='" + courseName + '\'' +
                ", numOfstudents=" + numOfstudents +
                ", season='" + season + '\'' +
                ", avgScore=" + avgScore;
    }
}
