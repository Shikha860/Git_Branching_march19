package objects;

public class Chocolate {

	  String brand;
	  int price;
	  int qty;  //nsm
	  
	  public void order(String b, int p,int q)
	  {
		  brand=b;
		  price=p;
		  qty=q;
	  }
	  
	  public void showdetails()
	  {
		  System.out.println(brand);
		  System.out.println(price);
		  System.out.println(qty);
	  }
	  public static void main(String[] args) {
		Chocolate c=new Chocolate();
		c.order("Cadbury",100,5);
		c.showdetails();
	}
	