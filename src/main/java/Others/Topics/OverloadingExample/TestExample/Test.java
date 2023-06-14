package Others.Topics.OverloadingExample.TestExample;

public class Test {
    public static void main(String[] args) {


 SubClass s = new SubClass();
 s.m();

 Super t = new SubClass();
 t.m();


//Super--->private void olunca CTE
// Super t = new SubClass();
// t.m();  -->












    }

}
