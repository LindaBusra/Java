package Others.Topics;

public class FormatMethod {


    public static void main(String[] args) {


        String siteName = "programiz.com";
        int empCount = 6;
        String type = "tutorial website";
        System.out.println(                 //Site Name : programiz.com, Emp Count: 6 Type: tutorial website
                String.format(
                        "Site Name : %s, Emp Count: %d Type: %s",
                        siteName, empCount, type
                )
        );
    }
    }

