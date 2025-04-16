import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
int[] numbers = new int[10];
System.out.println("Enter 10 num:");
for(int i=0;i<10;i++){
numbers[i]=scanner.nextInt();
}
	Arrays.sort(numbers);
System.out.println("num in ascending orger:");
for(int num:numbers)
{
System.out.println(num+" ");
}
}
}