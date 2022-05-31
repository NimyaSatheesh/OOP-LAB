import arithamatic_package.*;
import java.util.*;
class main_arithamatic {
public static void main(String []args){
arithamatic_package testObj = new arithamatic_package();
int a,b;
Scanner s=new Scanner(System.in);
System.out.print("Enter the first value : ");
a=s.nextInt();
System.out.print("Enter the second value : ");
b=s.nextInt();

System.out.println("ADD : "+testObj.add(a,b));
System.out.println("Substract : "+testObj.substract(a,b));
System.out.println("Multiple : "+testObj.multiple(a,b));
System.out.println("Divide : "+testObj.divide(a,b));
System.out.println("Remainder : "+testObj.remainder(a,b));
}
}