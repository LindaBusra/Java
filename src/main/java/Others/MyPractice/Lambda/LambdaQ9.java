package Others.MyPractice.Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaQ9 {
    public static void main(String[] args) {

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 120);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 152);
        Courses courseEnglishNight = new Courses("Autumn", "English Night", 93, 144);


        List<Courses> coursesList = new ArrayList<Courses>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);


        System.out.println(checkAverageScoreGreaterThanGivenNumber(coursesList, 90));


        System.out.println(courseEnglishDay.getAverageScore());
        courseEnglishNight.setAverageScore(100);
        System.out.println(courseEnglishNight);


    }


    //1)Create a program to check if all average scores are greater than given number
    public static boolean checkAverageScoreGreaterThanGivenNumber(List<Courses> coursesList, double num) {


        return coursesList.stream().allMatch(t -> t.getAverageScore() > num);
    }



}