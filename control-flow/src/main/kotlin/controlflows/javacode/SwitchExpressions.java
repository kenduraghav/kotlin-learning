package controlflows.javacode;

import java.util.Scanner;

public class SwitchExpressions {

    public static void main(String[] args) {

       try(Scanner sc = new Scanner(System.in)){
           System.out.println("Enter the numbers from 100 to 500");
           int num  = Integer.parseInt(sc.next());
           switch(num){
               case 100 -> System.out.println("The number is 100");
               case 200 -> System.out.println("The number is 200");
               case 300 -> System.out.println("The number is 300");
               default -> System.out.println("No value matched");

           }
       }
    }
}
