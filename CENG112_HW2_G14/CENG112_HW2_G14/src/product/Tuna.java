package product;

public class Tuna extends Product
{
	private int netWeight, drainedWeight;
	private String ingredient;
	
	
	public Tuna(int netWeight, int drainedWeight, String ingredient, String expirationDate)
	{
		this.netWeight = netWeight;
		this.drainedWeight = drainedWeight;
		this.ingredient = ingredient;
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

	public int getDrainedWeight() {
		return drainedWeight;
	}

	public void setDrainedWeight(int drainedWeight)
	{
		this.drainedWeight = drainedWeight;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) 
	{
		this.ingredient = ingredient;
	}

	@Override
	public String toString() 
	{
		return "Tuna [netWeight=" + netWeight + ", drainedWeight=" + drainedWeight + ", ingredient=" + ingredient
				+ ", expirationDate=" + expirationDate + "]";
	}
	
	
	
	
	
}
