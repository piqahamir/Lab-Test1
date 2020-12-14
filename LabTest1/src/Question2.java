import java.util.*;
public class Question2 {

	public static void main(String[] args) {
	
		double sales, commission, dailywages;
		int hours;
			
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter sales       : RM");
		sales  = in.nextDouble();
		System.out.print("Enter hours worked: ");
		hours = in.nextInt();
		
		
		if (sales >= 150 && sales <= 300) {
			commission = (sales*0.05);
		}else if (sales > 300 && sales <= 500) {
			commission = (sales*0.10);
		}else
			commission = (sales*0.15);
		
		dailywages = (hours*5) + commission;
		
		System.out.println();
		System.out.println("Commission     : RM" + commission);
		System.out.println("Daily wages    : RM" + dailywages);
	}

}
