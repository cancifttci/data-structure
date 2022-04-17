package structure;
import java.util.Arrays;
import java.util.EmptyStackException;

import interfaces.IStack;

public class Stack<T> implements IStack<T>
{	
	private int stackCapacity;
	private int topOfStack = -1;
	private static final int DEFAULT_CAPACITY = 50;
	private T[] stack;
	
	@SuppressWarnings("unchecked")
	public Stack() 
	{
		this.stackCapacity = DEFAULT_CAPACITY;
		this.stack = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int capacity)
	{	
		this.stackCapacity = capacity;
		this.stack = (T[]) new Object[capacity];
	}
	
	public void printAll()
	{
		for (int i = 0; i < stack.length; i++) 
		{
			if (stack[i] != null)
			{
				System.out.println(stack[i]);
			}
		}
	}
	
	@Override
	public void push(T item) 
	{
		ensureCapacity();
		stack[topOfStack + 1] = item;
		topOfStack++;
	}
	
	@SuppressWarnings("unchecked")
	private void ensureCapacity() 
	{	
		if (topOfStack == stack.length - 1)
		{
			int resize = stack.length * 2;
			T[] temp = (T[]) new Object[resize];
			for (int i = 0; i < stack.length; i++) 
			{
				temp[i] = stack[i];
			}
			stack = temp;
		}
	}
	
	@Override
	public T pop()
	{	
		if (isEmpty()) 
		{
			throw new EmptyStackException();
		}
		else 
		{
			T temp = stack[topOfStack];
			stack[topOfStack] = null;
			topOfStack--;
			return temp;
		}
	}

	@Override
	public T peek() 
	{	
		if (isEmpty()) 
		{
			throw new EmptyStackException();
		} 
		else 
		{
			T temp = stack[topOfStack];
			return temp;
		}
	}

	@Override
	public boolean isEmpty() 
	{
		if (topOfStack == -1) {return true;}
		else {return false;}
	}

	@Override
	public void clear() 
	{
		for (int i = 0; i <= topOfStack; i++) 
		{
			stack[i] = null;
		}
		topOfStack = -1;
	}

	@Override
	public String toString() 
	{
		return "Stack [stackCapacity=" + stackCapacity + ", topOfStack=" + topOfStack + ", stack="
				+ Arrays.toString(stack) + "]";
	}
	
	
	
}
