package product;

public class InstantNoodle extends Product
{
	private int netWeight;
	private int simmerDuration;
	
	public InstantNoodle(int netWeight, int simmerduration, String expirationDate)
	{
		this.netWeight = netWeight;
		this.simmerDuration = simmerduration;
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

	public int getSimmerDuration() 
	{
		return simmerDuration;
	}

	public void setSimmerDuration(int simmerDuration)
	{
		this.simmerDuration = simmerDuration;
	}

	@Override
	public String toString() 
	{
		return "InstantNoodle [netWeight=" + netWeight + ", simmerDuration=" + simmerDuration + ", expirationDate="
				+ expirationDate + "]";
	}
	
	
}
