import java.util.Scanner;
public class Area1{
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int l,b;	
		System.out.print("Enter the length of the rectangle: ");
		l=input.nextInt ();
		System.out.print("Enter the breadth of the rectangle: ");
		b=input.nextInt ();
		setDim (l,b);
	}

	public static void setDim(int x, int y){
	getArea (x,y);
	}
	public static void getArea (int x, int y){
	int area ;
	area=x*y;
	System.out.println("The Area of the rectangle is "+area);
	}
}
