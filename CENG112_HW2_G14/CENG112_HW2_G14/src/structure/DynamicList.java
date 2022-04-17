package structure;
import java.util.Arrays;

import interfaces.IDynamicList;

public class DynamicList <T> implements IDynamicList<T>
{
	
	private T[] dynamicList;
	private int numberOfItem;
	private static final int DEFAULT_CAPACITY = 2;
	
	
	
	@SuppressWarnings("unchecked")
	public DynamicList() 
	{	
		this.dynamicList = (T[]) new Object[DEFAULT_CAPACITY];
		this.numberOfItem = 0;	
	}
	
	@SuppressWarnings("unchecked")
	public DynamicList(int capacity) 
	{	
		this.dynamicList = (T[]) new Object[capacity];
		this.numberOfItem = 0;	
	}
	 
	@SuppressWarnings("unchecked")
	private void ensureCapacity()
	{
		 
		if (numberOfItem >= dynamicList.length - 1) 
		{
			int resize = dynamicList.length * 2;
			T[] temp = (T[]) new Object[resize];
			for (int i = 0; i < dynamicList.length; i++) {
				temp[i] = dynamicList[i];
			}
			dynamicList = temp;
		}	 
	}
	
	@Override
	public void add(T item) 
	{
		dynamicList[numberOfItem] = item;
		numberOfItem++;
		ensureCapacity();
		
	}

	@Override
	public void add(int position, T item) 
	{
		if (position<=numberOfItem && position>=0)
		{
			ensureCapacity();
			for (int i = numberOfItem; i >= position; i--) 
			{
				dynamicList[i + 1] = dynamicList[i];
			}
			dynamicList[position] = item;
			numberOfItem++;
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
		
	}

	@Override
	public T remove(int position) 
	{
		if (position<=numberOfItem && position>=0)
		{	
			if (isEmpty()) 
			{
				return null;
			}
			else
			{
				T temp;
				temp = dynamicList[position];
				for (int i = position; i <= numberOfItem; i++)
				{
					dynamicList[i] = dynamicList[i+1]; 
				}
				numberOfItem--;
				return temp;
			}
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}	
	}

	@Override
	public void clear() 
	{
		if (!isEmpty())
		{
			for (int i = 0; i < numberOfItem; i++)
			{
				dynamicList[i] = null;
			}
		}		
	}
	
	public void printAll()
	{
		for (int i = 0; i < numberOfItem; i++) 
		{
			if (dynamicList[i] != null)
			{
				System.out.println(dynamicList[i]);
			}
		}
	}
	
	@Override
	public T replace(int position, T item)
	{
		if (position>=0 && position<=numberOfItem) 
		{	
			if (!isEmpty())
			{
				T temp = dynamicList[position];
				dynamicList[position] = item;
				return temp;
			}
			else {return null;}
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}

	}

	@Override
	public T getEntry(int position)
	{
		if (position<=numberOfItem && position>=0) 
		{
			if (!isEmpty()) 
			{
				T temp;
				temp = dynamicList[position];
				return temp;
			}
			else {return null;}
		}
		else 
		{
			throw new IndexOutOfBoundsException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray()
	{
		T[] temp = (T[]) new Object[dynamicList.length];
		for (int i = 0; i < dynamicList.length; i++)
		{
			temp[i] = dynamicList[i];
		}
		return temp;
	}

	@Override
	public boolean contains(T item)
	{	
		for (int i = 0; i <= numberOfItem; i++)
		{
			if (item.equals(dynamicList[i]))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public int getLength() 
	{	
		int temp = numberOfItem;
		return temp;
	}

	@Override
	public boolean isEmpty() 
	{
		return numberOfItem == 0;
	}

	@Override
	public String toString() 
	{
		return Arrays.toString(dynamicList) + ", numberOfItem : " + numberOfItem;
	}
	
}
