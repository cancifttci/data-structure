package product;

public class Pudding extends Product
{
	private int netWeight;
	private String flavor;
	
	public Pudding(int netWeight, String flavor, String expirationDate)
	{
		this.netWeight = netWeight;
		this.flavor = flavor;
		super.expirationDate = expirationDate;
	}

	public int getNetWeight() 
	{
		return netWeight;
	}

	public void setNetWeight(int netWeight) 
	{
		this.netWeight = netWeight;
	}

	public String getFlavor() 
	{
		return flavor;
	}

	public void setFlavor(String flavor) 
	{
		this.flavor = flavor;
	}

	@Override
	public String toString() 
	{
		return "Pudding [netWeight=" + netWeight + ", flavor=" + flavor + ", expirationDate=" + expirationDate + "]";
	}
	
}
