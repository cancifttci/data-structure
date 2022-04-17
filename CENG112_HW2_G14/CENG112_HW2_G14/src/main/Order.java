package main;

public class Order
{
	private String foodCategory1,foodCategory2,foodCategory3;
	private int orderId;
	private String date;
	
	public Order(int orderId, String date, String foodCategory1, String foodCategory2, String foodCategory3) 
	{
		this.foodCategory1 = foodCategory1;
		this.foodCategory2 = foodCategory2;
		this.foodCategory3 = foodCategory3;
		this.orderId = orderId;
		this.date = date;
	}

	public String getFoodCategory1() 
	{
		return foodCategory1;
	}

	public void setFoodCategory1(String foodCategory1)
	{
		this.foodCategory1 = foodCategory1;
	}

	public String getFoodCategory2() {
		return foodCategory2;
	}

	public void setFoodCategory2(String foodCategory2) 
	{
		this.foodCategory2 = foodCategory2;
	}

	public String getFoodCategory3() 
	{
		return foodCategory3;
	}

	public void setFoodCategory3(String foodCategory3) 
	{
		this.foodCategory3 = foodCategory3;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public int getOrderId()
	{
		return orderId;
	}

	public String getDate() 
	{
		return date;
	}

	@Override
	public String toString() 
	{
		return "Order [foodCategory1=" + foodCategory1 + ", foodCategory2=" + foodCategory2 + ", foodCategory3="
				+ foodCategory3 + ", orderId=" + orderId + ", date=" + date + "]";
	}
	
	
	
}
