class Product{
	String Pcode,Pname;
	double price;
	void details(){
		System.out.println("PRODUCT DETAILS");
		System.out.println("PCODE : "+Pcode);
		System.out.println("PNAME : "+Pname);
		System.out.println("PRICE : "+price);
	}
}
public class ProductDetails{
	public static void main(String args[]){
		Product p1=new Product();
		p1.Pcode="M200J9P1";
		p1.Pname="POCO M2";
		p1.price=10999;
		System.out.println("\n PRODUCT 1:-");
		p1.details();
		Product p2= new Product();
		p2.Pcode="XMSHOSHM";
		p2.Pname="Mi Brand 3";
		p2.price=1799;
		System.out.println("\n PRODUCT 2:-");
		p2.details();
		Product p3=new Product();
		p3.Pcode="EPSP5248";
		p3.Pname="Camlin Scale";
		p3.price=5;
		System.out.println("\n PRODUCT 3:-");
		p3.details();
		if(p1.price < p2.price && p1.price < p3.price){
			System.out.println("\n PRODUCT with Lower Price is :-");
			p1.details();
		}
		else if(p2.price<p3.price){
			System.out.println("\n Product with Lowest Price is:-");
			p2.details();
		}
		else{
			System.out.println("\n Product With Lowest Price is :-");
			p3.details();
		}
	}
}