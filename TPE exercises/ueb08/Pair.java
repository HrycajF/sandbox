package ueb08;

public class Pair<T, V> {
	
	private final T first;
	private final V second;
	
	public Pair(T first, V second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return this.first;
	}
	
	public V getSecond() {
		return this.second;
	}
	

}
