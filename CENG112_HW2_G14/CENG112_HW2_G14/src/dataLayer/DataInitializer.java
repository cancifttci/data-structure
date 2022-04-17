package dataLayer;

import main.Order;
import structure.DynamicList;

public class DataInitializer 
{
	public DynamicList<Order> initializeData()
	{
		CSVReader reader = new CSVReader();
		DynamicList<String> data = new DynamicList<>();
		DynamicList<Order> order = new DynamicList<>();
		data = reader.readData();
		for (int i = 0; i < data.getLength(); i = i+5) 
		{	
			order.add(new Order(Integer.parseInt(data.getEntry(i)), data.getEntry(i+1), data.getEntry(i+2), data.getEntry(i+3), data.getEntry(i+4)));
		}
		
		return order;
		
	}
	
}
