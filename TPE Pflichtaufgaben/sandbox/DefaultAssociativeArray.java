package sandbox;

public class DefaultAssociativeArray<K, V> implements AssociativeArray<K, V> {

	private Element root;

	public DefaultAssociativeArray() {
		this.root = null;
	}

	// BEGINN INNERE KLASSE
	// EVTL NOCH ZU EINER ANDEREN INNEREN KLASSE ÄNDERN, DARF VON AUßEN NICHT
	// AUFGERUFEN WERDEN KÖNNEN.
	private class Element {
		KeyValue<K, V> keyValue;
		Element left;
		Element right;

		public Element(KeyValue<K, V> keyValue) {
			this.keyValue = keyValue;
			this.left = null;
			this.right = null;
		}

		public Element(KeyValue<K, V> keyValue, Element left, Element right) {
			this(keyValue);
			this.left = left;
			this.right = right;
		}

		public KeyValue<K, V> getKeyValue() {
			return this.keyValue;
		}

		public Element getLeft() {
			return this.left;
		}

		public Element getRight() {
			return this.right;
		}

	} // ENDE INNERE KLASSE

	public DefaultAssociativeArray<K, V> getLeftArray() {
		DefaultAssociativeArray<K, V> leftArray = new DefaultAssociativeArray<>();
		leftArray.root = root.getLeft();
		return leftArray;
	}

	public DefaultAssociativeArray<K, V> getRightArray() {
		DefaultAssociativeArray<K, V> rightArray = new DefaultAssociativeArray<>();
		rightArray.root = root.getRight();
		return rightArray;
	}

	@Override
	public void clear() {
		this.root = null;
	}

	@Override
	public boolean containsValue(V value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return (this.root == null);
	}

	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void putAll(AssociativeArray<K, V> array) {
		// TODO Auto-generated method stub

	}

	@Override
	public V remove(K key) {
		// TODO VERWENDUNG EINER ANDEREN METHODE UM ZU VEREINFACHEN
		return null;
	}

	@Override
	public int size() {
		if (root == null) {
			return 0;
		} else {
			return 1 + this.getLeftArray().size() + this.getRightArray().size();
		}
	}

	@Override
	public void update(K key, V value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void forEach(BiConsumer biConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void extractAll(AssociativeArray<K, V> array) {
		// TODO Auto-generated method stub

	}

	@Override
	public void map(BiFunction biFunction) {
		// TODO Auto-generated method stub

	}

}
