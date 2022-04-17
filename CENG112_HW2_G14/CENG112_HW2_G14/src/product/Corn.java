package product;

public class Corn extends Product
{
	private int netWeight, drainedWeight;
	private String productionCountry;
	
	public Corn(int netWeight, int drainedWeight, String productionCountry, String expirationDate)
	{
		this.netWeight = netWeight;
		this.drainedWeight = drainedWeight;
		this.productionCountry = productionCountry;
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

	public int getDrainedWeight() 
	{
		return drainedWeight;
	}

	public void setDrainedWeight(int drainedWeight)
	{
		this.drainedWeight = drainedWeight;
	}

	public String getProductionCountry() {
		return productionCountry;
	}

	public void setProductionCountry(String productionCountry)
	{
		this.productionCountry = productionCountry;
	}

	@Override
	public String toString() 
	{
		return "Corn [netWeight=" + netWeight + ", drainedWeight=" + drainedWeight + ", productionCountry="
				+ productionCountry + ", expirationDate=" + expirationDate + "]";
	}
	
}
