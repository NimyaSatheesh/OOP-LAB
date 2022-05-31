import package_graphics.*;
import java.util.*;
public class main_graphics {
	public static void main(String []args){
		package_graphics testObj = new package_graphics();
		int l,h,r,a,c,d;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the length for rectangle : ");
		l=s.nextInt();
		System.out.print("Enter the breadth for rectangle : ");
		h=s.nextInt();
		System.out.print("Enter the radius of circle : ");
		r=s.nextInt();
		System.out.print("Enter the side for Square : ");
		a=s.nextInt();
		System.out.print("Enter the breadth for triangle : ");
		c=s.nextInt();
		System.out.print("Enter the height for triangle : ");
		d=s.nextInt();
		System.out.println("Area of rectangle = "+testObj.recArea(l,h));
		System.out.println("Area of Circle = "+testObj.cirArea(r));
		System.out.println("Area of Square = "+testObj.squArea(a));
		System.out.println("area of Triangle = "+testObj.triArea(c,d));
	}
}
