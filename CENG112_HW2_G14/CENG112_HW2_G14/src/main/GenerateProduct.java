package main;
import product.*;
import structure.Stack;

public class GenerateProduct 
{
	private static final String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private static final String[] years = {"22","23","24"};
	public Stack<Corn> createCorn(int amount)
	{	
		String year = years[0], month, date;
		Stack<Corn> temp = new Stack<>();
		for (int i = 0; i < amount; i++) 
		{
			if((i + 6)%12 == 0) 
			{
				if (year.equals(years[1]))
				{
					year = years[2];
				}
				else
				{
					year = years[1];
				}	
			}
			month = months[(6+i)%12];
			date = "1-" + month +"-"+year;
			temp.push(new Corn(220, 132, "Turkey", date));
			
		}
		Stack<Corn> temp1 = new Stack<>();
		for (int i = 0; i < amount; i++)
		{
			temp1.push(temp.pop());
		}	
		return temp1;
	}
	
	public Stack<Tuna> createTuna(int amount)
	{	
		String year = years[0], month, date;
		Stack<Tuna> temp = new Stack<>();
		for (int i = 0; i < amount; i++) 
		{
			if((i + 6)%12 == 0) 
			{
				if (year.equals(years[1]))
				{
					year = years[2];
				}
				else
				{
					year = years[1];
				}	
			}
			month = months[(6+i)%12];
			date = "1-" + month +"-"+year;
			temp.push(new Tuna(75, 50, "tuna, sunflower oil, salt", date));
			
		}
		Stack<Tuna> temp1 = new Stack<>();
		for (int i = 0; i < amount; i++)
		{
			temp1.push(temp.pop());
		}	
		return temp1;
	}
	
	public Stack<Pudding> createPudding(int amount)
	{	
		String year = years[0], month, date;
		Stack<Pudding> temp = new Stack<>();
		for (int i = 0; i < amount; i++) 
		{
			if((i + 6)%12 == 0) 
			{
				if (year.equals(years[1]))
				{
					year = years[2];
				}
				else
				{
					year = years[1];
				}	
			}
			month = months[(6+i)%12];
			date = "1-" + month +"-"+year;
			temp.push(new Pudding(220, "banana", date));
			
		}
		Stack<Pudding> temp1 = new Stack<>();
		for (int i = 0; i < amount; i++)
		{
			temp1.push(temp.pop());
		}	
		return temp1;
	}
	
	public Stack<InstantNoodle> createInstantNoodle(int amount)
	{	
		String year = years[0], month, date;
		Stack<InstantNoodle> temp = new Stack<>();
		for (int i = 0; i < amount; i++) 
		{
			if((i + 6)%12 == 0) 
			{
				if (year.equals(years[1]))
				{
					year = years[2];
				}
				else
				{
					year = years[1];
				}	
			}
			month = months[(6+i)%12];
			date = "1-" + month +"-"+year;
			temp.push(new InstantNoodle(220, 180, date));
			
		}
		Stack<InstantNoodle> temp1 = new Stack<>();
		for (int i = 0; i < amount; i++)
		{
			temp1.push(temp.pop());
		}	
		return temp1;
	}
}
