import java.util.*;
import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class PalindromeChecker
   {
   
       public static void main(String args[])
   { 
     
       int t,x=0,y;
 
        System.out.println("Hello, Dcoder!");
        System.out.println("I am LitGuy.");
      
        Scanner input = new Scanner(System.in);
   
        System.out.println("Enter number : ");
   
        int a = input.nextInt();
        t=a;
   
        while(t>0)
      {
        
        x=(x*10)+(t%10);
        t=(t/10);
        
      }
      
      
      if(a==x)
      
        System.out.println("This Number is a Palindrome.");
      
      
      else if (t!=x)
      
      System.out.println("This Number is not a palindrome.");
     
      else System.out.println("Error");
     }
     
    
    
   }
   
 
