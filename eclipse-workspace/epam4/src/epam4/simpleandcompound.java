package epam4;
import java.util.*;
public class simpleandcompound {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Principle amount:");
		double principle=in.nextDouble();
		System.out.println("Enter the Annual Time:");
		double time=in.nextDouble();
		System.out.println("Enter Rate Of Interest:");
		double rateofinterest=in.nextDouble();
		siandci amount=new siandci(principle,time,rateofinterest);
		double si=amount.simpleinterest();
		double ci=amount.compoundinterest();
		System.out.println("simple interset= "+si);
		
		System.out.println("compound interest= "+ci);
		in.close();
	}

}
