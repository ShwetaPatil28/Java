import java.util.Scanner;    
public class Prime  
{    
//function to check if the input number is prime or not  
static boolean isPrime(int n)   
{    
    if (n <= 1)     
           return false;    
       for (int i = 2; i <= Math.sqrt(n); i++)   
           if (n % i == 0)   
               return false;    
       return true;    
   }    
//main function  
   public static void main(String[] args)   
   {    
//reading input from user  
       Scanner s = new Scanner(System.in);    
       System.out.print("Enter a number : ");    
       int num = s.nextInt();    
//function calling  
       if (isPrime(num))   
       {    
           System.out.println(num + " is a prime");    
       }   
       else   
       {    
System.out.println(num + " is not a prime");    
       }    
   }    
  }    