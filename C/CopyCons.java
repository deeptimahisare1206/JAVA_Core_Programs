import java.util.*;

class Stock{
	int stockid, price;
	
	Stock(int x, int y){
		stockid = x;
		price = y;
		
	}
	void display(){
		System.out.println("List of stocks:-");
		System.out.println("Stock id: " + stockid);
		System.out.println("Price: "  + price);
		
	}
	Stock(Stock s){
		stockid = s.stockid;
		price = s.price;
	}
}

class CopyCons{
	public static void main(String args []){
		
		Stock sk = new Stock(1, 200);
		sk.display();
		Stock sk1 = new Stock(sk);
		sk1.display();
		
	}
}
