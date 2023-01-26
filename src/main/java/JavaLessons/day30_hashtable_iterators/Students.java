package JavaLessons.day30_hashtable_iterators;

public class Students {

      public String email;
      public int age;
      public int grade;
      public String nationality;


   //when I create an object, I need this constructor
    public Students(String email, int age, int grade, String nationality) {
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.nationality = nationality;
    }

    //right buton in mouse-->generate-->toString-->select them-->it brings this method. We can change this method
    @Override
    public String toString() {
        return "[" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", nationality='" + nationality + '\'' +
                ']';
    }
}
