package dataLayer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import structure.DynamicList;

public class CSVReader 
{
	private final String path = "orders.csv";
	
	public DynamicList<String> readData()
	{
		DynamicList<String> list = new DynamicList<String>();
		try 
		{
			Scanner scanner = new Scanner(new File(path));
			String data;
			String values[];
			while (scanner.hasNext())
			{
				data = scanner.nextLine();
				values = data.split(",");
				list.add(values[0] = values[0].replaceAll("\\s+",""));
				list.add(values[1] = values[1].replaceAll("\\s+",""));
				list.add(values[2] = values[2].replaceAll("\\s+",""));
				list.add(values[3] = values[3].replaceAll("\\s+",""));
				list.add(values[4] = values[4].replaceAll("\\s+",""));
			}
			scanner.close();
		}
		catch (FileNotFoundException e) 
		{
			System.err.println("Error : " + e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
}
