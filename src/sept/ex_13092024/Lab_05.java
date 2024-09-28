package sept.ex_13092024;

public class Lab_05 {
    public static void main(String [] args)
    {
        //print table of 9 with hardcode
        System.out.println("9x1=9");
        System.out.println("9x2=18");
        System.out.println("9x3=27");
        System.out.println("9x4=36");

        //String Formatting
    //print table with string formatting

        // %d ---Integer,byte,short
        // %c---charcter
        // %f----float,double
        // %s----string
        int num=9;

        System.out.printf("%d*%d=%d",num,1,num*1);
        //\n for new line
        System.out.println("\n");

        String Name="Aryan";
        String lastname="Pandey";
        System.out.printf("Your First Name is %s and Last name is %s",Name,lastname);



    }
}

