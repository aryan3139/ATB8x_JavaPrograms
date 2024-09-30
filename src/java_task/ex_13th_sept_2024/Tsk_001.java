
package java_task.ex_13th_sept_2024;
import java.io.*;
import java.util.Scanner;


public class Tsk_001 {
    public static void main(String[] args)
    {


        System.out.println("Enter Number:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for( int i=1;i<=10;i++)
        {

            System.out.printf("%d*%d=%d",num,i,num*i);
            System.out.println();
        }
    }
}
