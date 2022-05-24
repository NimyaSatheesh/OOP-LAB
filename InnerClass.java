import java.util.*;
class Outer{
	int x=10;
	class Inner{
		int y=5;
	}
}
public class InnerClass{
	public static void main(String args[]){
		Outer Outerobj=new Outer();
		Outer.Inner Innerobj=Outerobj.new Inner();
		System.out.println("x = "+Outerobj.x);
		System.out.println("y = "+Innerobj.y);
	}
}
