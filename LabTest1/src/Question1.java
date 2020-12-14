import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		
		int numItems, qtt1, qtt2, qtt3;
		double totalPrice1, totalPrice2, totalPrice3, totalPrice, discount, price1, price2, price3;
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter number of items: ");
		numItems =  in.nextInt();
		System.out.print("Enter price for first item: RM");
		price1 = in.nextDouble();
		System.out.print("Enter quantity for fisrt item: ");
		qtt1 = in.nextInt();
		System.out.println();
		
		totalPrice1 = price1*qtt1;
		
		System.out.print("Enter price for second item: RM");
		price2 = in.nextDouble();
		System.out.print("Enter quantity for second item: ");
		qtt2 = in.nextInt();
		System.out.println();
		
		totalPrice2 = price2*qtt2;
		
		System.out.print("Enter price for third item: RM");
		price3 = in.nextDouble();
		System.out.print("Enter quantity for third item: ");
		qtt3 = in.nextInt();
		System.out.println();
		
		totalPrice3 = price3*qtt3;
		totalPrice = totalPrice1 + totalPrice2 + totalPrice3;
		System.out.println("Total price      : RM" + totalPrice);
		
		if(totalPrice > 100) {
			discount = (totalPrice*0.2);
		}else 
			discount = (totalPrice*0.1);
		
		
		System.out.println("Discount received: RM" + discount );
		System.out.println("Price to be paid : RM" + (totalPrice-discount));
	}

}
