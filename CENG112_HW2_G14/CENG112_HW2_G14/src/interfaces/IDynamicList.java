package interfaces;

public interface IDynamicList <T>{
	
	public void add(T item);
	public void add(int position, T item);
	public T remove(int position);
	public void clear();
	public T replace(int position, T item);
	public T getEntry(int position);
	public T[] toArray();
	public boolean contains(T item);
	public int getLength();
	public boolean isEmpty();
	
}
