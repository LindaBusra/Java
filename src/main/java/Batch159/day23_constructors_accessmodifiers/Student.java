package Batch159.day23_constructors_accessmodifiers;

public class Student {
        //A class not be private!!!  Classes can not be declared as protected
        //Class is for create an object, you can not do it hidden. Dont use "private"
        //A class can be just "public" or "default"

  //If a class member(variable-method-constructor) is "private" it means it cannot be visible(accessible) from other classes
  //So by making a class member "private", it means we are hiding the class member inside the class
        private String stdId = "TH20211704";
  //A class not be private!!!


  //To make a class member "default" do not type any access modifier. the other name of "default" is "package private"
  //If you are in the same package with the default class member, you can access to it.
  //If you are in a different package with the default class member, you cannot access to it.

        int age = 13;           //default can be visible inside the package


  //If a class member is "public", you can access to it from entire the project

        public boolean isSuccess = true;


  //If a class member is protected, you can access to it from the same package and child classes from other packages
        protected int grade = 11;





}
