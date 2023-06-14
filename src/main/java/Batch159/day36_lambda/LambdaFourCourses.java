package Batch159.day36_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaFourCourses {

    public static void main(String[] args) {

        Courses courseTurkishDayTime = new Courses("Turkish Day Time", 124, "Summer", 97.2);
        Courses courseTurkishNightTime = new Courses("Turkish Night Time", 125, "Winter", 98.4);
        Courses courseEnglishDayTime = new Courses("English Day Time", 138, "Winter", 93.8);
        Courses courseEnglishNightTime = new Courses("English Night Time", 111, "Winter", 95.3);


        List<Courses> courses = new ArrayList<>();
        courses.add(courseTurkishDayTime);
        courses.add(courseTurkishNightTime);
        courses.add(courseEnglishDayTime);
        courses.add(courseEnglishNightTime);

        System.out.println(courses);

        //Examples:
        System.out.println(checkAvgScoreToBeGreaterThanSpecificValue(courses, 93));

        System.out.println(checkAnyCourseNameContainsSpecificWord(courses, "TURKISH"));
        System.out.println(checkAnyCourseNameContainsSpecificWord(courses, "German"));

        System.out.println(getCourseAvgHighest(courses));

        System.out.println(getCourseAvgGivenHighest(courses,2));
        System.out.println(getCourseNumOfStdGivenLowest(courses,1));
        System.out.println(getAvgNumOfStd(courses));


    }

    //Example 1: Check all average scores if they are greater than 93

    public static boolean checkAvgScoreToBeGreaterThanSpecificValue(List<Courses> courses, double avg) {

        return courses.stream().allMatch(t -> t.getAvgScore() > avg);
    }


    //Example 2: Create a method to check if at least one of the course names contains "Turkish" word with ignoring cases

    public static boolean checkAnyCourseNameContainsSpecificWord(List<Courses> courses, String word) {

        return courses.stream().
                map(t->t.getCourseName().toLowerCase()).
                anyMatch(t->t.contains(word.toLowerCase()));
    }



    //Example 3: Create a method to find the course whose average score is the highest
    public static Courses getCourseAvgHighest(List<Courses> courses){

        return  courses.stream().sorted(Comparator.comparing(Courses::getAvgScore).reversed()).
                findFirst().get();
    }


    //Example 4: Create a method to find the course whose average score is the third highest
    public static Courses getCourseAvgGivenHighest(List<Courses> courses, int numOfSkippedLines){

        //skip first 2, and take the next one (just give me next one line-->limit)
       return courses.stream().sorted(Comparator.comparing(Courses::getAvgScore).reversed()).
                skip(numOfSkippedLines).
                limit(1).       //this give me stream. //If you want to select first some elements from a stream use limit()
                                        //limit(3) returns first 3 elements from a stream in a stream
                findFirst().     //it gives me just Object, which is Optional Data type.
                get();

    }


    //Example 5: Create a method to find the course whose number of students is the second lowest

    public static Courses getCourseNumOfStdGivenLowest(List<Courses> courses, int numOfSkippedLines){

        return courses.
                stream().
                sorted(Comparator.comparing(Courses::getNumOfstudents)).
                skip(1).
//                limit(1).     //it is not mandatory
                findFirst().get();
    }



    //Example 6: Create a method to find the average number of students in the courses

    public static double getAvgNumOfStd(List<Courses> courses) {

        return courses.stream().map(t->t.getNumOfstudents()).reduce(0,(t,u)->t+u)/(double)courses.size();
        //courses.stream() here I have course object, but I dont want them, I will convert object to number of student, so I use map

    }
}