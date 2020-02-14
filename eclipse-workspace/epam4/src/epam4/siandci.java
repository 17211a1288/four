package epam4;

public class siandci {
	double principle,time,rateofinterest;
	siandci(double principle,double time,double rateofinterest)
	{
		this.principle=principle;
		this.time=time;
		this.rateofinterest=rateofinterest;
	}
	public double simpleinterest()
	{
		return (principle*time*rateofinterest)/100;
	}
	public double compoundinterest()
	{
		return (principle*Math.pow(1.0+rateofinterest/100,time)-principle);
	}
}
