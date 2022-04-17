package structure;
import java.util.Arrays;
import interfaces.IQueue;

public class Queue<T> implements IQueue<T> 
{
	private int queueCapacity, front, rear;
	private static final int DEFAULT_CAPACITY = 30;
	private T[] queue;
	private int count = 0;
	
	@SuppressWarnings("unchecked")
	public Queue()
	{
		this.queue = (T[]) new Object[DEFAULT_CAPACITY];
		this.front = 0;
		this.rear = 0;
		this.queueCapacity = DEFAULT_CAPACITY;
	}
	
	@SuppressWarnings("unchecked")
	public Queue(int capacity) 
	{
		
		this.queue = (T[]) new Object[capacity];
		this.front = 0;
		this.rear = 0;
		this.queueCapacity = capacity;
	}
	
	public void printAll()
	{
		for (int i = 0; i < queue.length; i++) 
		{	
			if (queue[i] != null) {
				System.out.println(queue[i]);
			}
		}
	}
	
	@Override
	public void enqueue(T item) 
	{	
		
		
		queue[rear] = item;
		rear = (rear + 1) ;
		count++;
		ensureCapacity();
	}
	@SuppressWarnings("unchecked")
	private void ensureCapacity()
	{
		if (rear == queue.length - 1) 
		{
			int currentSize = queue.length;
			T[] temp = (T[]) new Object[currentSize*2];
			for (int i = 0; i < count; i++) {
				temp[i] = queue[front+i];
			}
			rear = count;
			front = 0;
			queue = temp;
		}
	}
	
	@Override
	public T dequeue()
	{
		
		if (!isEmpty()) {
			T temp = queue[front];
			queue[front] = null;
			front = (front + 1);
			count--;
			return temp;
		}
		else {return null;}
	}

	@Override
	public T getFront()
	{
		
		if (isEmpty())
		{
			return null;
		}
		else 
		{
			T temp = this.queue[front];
			return temp;
		}
	}

	@Override
	public boolean isEmpty() 
	{
		return count == 0;
	}
		
	@Override
	public void clear() 
	{
		for (int i = 0; i < queue.length; i++) 
		{
			queue[i] = null;
		}
		
	}
	@Override
	public String toString() 
	{
		return "Queue [queueCapacity=" + queueCapacity + ", front=" + front + ", rear=" + rear + ", queue="
				+ Arrays.toString(queue) + "]";
	}
		
	
}
