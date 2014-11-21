package ueb08;

public class PairList<T, V> {
	
	private int maxObjects;
	private Pair<T, V>[] array;
	
	
	@SuppressWarnings("unchecked")
	public PairList(int maxObjects) {
		this.maxObjects = maxObjects;
		this.array = (Pair<T, V>[]) new Pair[maxObjects];
	}
	
	public int getMaxObjects() {
		return this.maxObjects;
	}
	
	public Object[] getArray() {
		return this.array;
	}
	
	public void add(T first, V second, int index) {
		this.array[index] = new Pair(first, second);		
	}
	
	public Object get(int index) {
		return this.array[index];
	}

}
