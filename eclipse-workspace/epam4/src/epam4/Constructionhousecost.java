package epam4;
import java.util.*;
public class Constructionhousecost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("MATERIAL STANDARD IS IN RANGE FROM (1-4)");
		System.out.println("Choose the value of material standard:");
		int materialstandard=in.nextInt();
		System.out.println("TOTAL AREA IS IN SQUARE FEETS");
		System.out.println("Enter total area in square feets:");
		int totalarea=in.nextInt();
		System.out.println("THE HOUSE IS AUTOMATED IF HOUSE IS OF ABOVE HIGH STANDARDS CAN BE DENOTED BY 1");
		System.out.println("THE HOUSE IS NOT AUTOMATED IF IT IS NOT ABOVE HIGH STANDARDS CAN BE DENOTED BY 0");
		System.out.println("Choose the house type either 1 or 0:");
		int isautomated=in.nextInt();
		constructhouse house=new constructhouse(materialstandard,totalarea,isautomated);
		long totalcost=(long)house.costofhouse();
		System.out.println();
		System.out.println("TOTAL COST FOR HOUSE CONSTRUCTION: Rs."+totalcost);
	}

}
