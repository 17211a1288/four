package epam4;
import java.util.*;
public class simpleandcompound {
	public static double si(double principle,double time,double rateofinterest)
	{
		return ((principle*time*rateofinterest)/100);
	}
	/*public static double ci(double principle,double time,double rateofinterest)
	{
		rateofinterest=(1+(rateofinterest/100));
		rateofinterest=Math.pow(rateofinterest, time);
		double amount=principle*rateofinterest;
		return (amount-principle);
	}*/
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
	}

}
