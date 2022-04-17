package main;
import product.Product;
import structure.DynamicList;

public class Cargo 
{
	private int cargoID;
	private String processDate;
	private DynamicList<Product> productList;
	
	public Cargo(int cargoID,String processDate, DynamicList<Product> productList) 
	{
		this.cargoID = cargoID;
		this.processDate = processDate;
		this.productList = productList;
	}

	public int getCargoID()
	{
		return cargoID;
	}

	public void setCargoID(int cargoID) 
	{
		this.cargoID = cargoID;
	}

	public String getProcessDate()
	{
		return processDate;
	}

	public void setProcessDate(String processDate) 
	{
		this.processDate = processDate;
	}

	public DynamicList<Product> getProductList()
	{
		return productList;
	}

	public void setProductList(DynamicList<Product> productList)
	{
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Cargo " + cargoID + ", processDate: " + processDate + ", productList: " + productList;
	}
	
	
}
