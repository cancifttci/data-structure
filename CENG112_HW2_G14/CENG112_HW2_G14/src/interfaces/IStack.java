package interfaces;

public interface IStack <T> {
	
	public T pop();
	public T peek();
	public boolean isEmpty();
	public void clear();
	public void push(T item);

}
