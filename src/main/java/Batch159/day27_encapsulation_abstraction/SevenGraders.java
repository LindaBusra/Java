package Batch159.day27_encapsulation_abstraction;

public class SevenGraders extends Courses{

    @Override
    public void math() {
        System.out.println("Learn square root");
    }

    @Override
    public void art() {
        super.art();
    }
}
