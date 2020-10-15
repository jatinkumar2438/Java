import java.util.*;
import java.util.Scanner;
import javax.swing.*;
 // Compiler version JDK 11.0.2

 class PalindromeChecker
   {
   
       public static void main(String args[])
    { 
     
       String t,c="";
 
        System.out.println("Hello, Dcoder!");
        System.out.println("I am LitGuy.");
      
        Scanner input = new Scanner(System.in);
   
        System.out.println("Enter String : ");
   
        String a = input.nextLine();
        t=a;
        int n=t.length(); int v=n,r=1;

          for (int i=1;i<=v;i++)
                { 
                  c=c+(t.substring(n-1,n));
                  n--;
                }
      
            if(a.equalsIgnoreCase(c))
                  System.out.println("This String is a Palindrome.");
            else if (t!=c)
                  System.out.println("This String is not a palindrome.");
            else System.out.println("Error");      
            
      }
     
    
    
   }
   
 
