
package practice;

import java.util.Scanner;


public class InputFromConsole {
    public static void main(String args[]){
        int a;
        float b;
        String c;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert your name");
        c=input.nextLine();
        System.out.println("id");
        a=input.nextInt();
        System.out.println("gpa");
        b=input.nextFloat();
        
        System.out.println("id gpa and name are coresponding : "+a);
        System.out.println(b);
        System.out.println(c);
      String aaa=  System.console().readLine();
        System.out.println(aaa);
//        in.close();
    }
}
