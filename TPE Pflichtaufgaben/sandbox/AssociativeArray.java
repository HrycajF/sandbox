package sandbox;

//TODO Kommentar f�r Interface einf�gen!

/**
 * 
 * @author IB 5
 *
 * @param <K>
 * @param <V>
 */
public interface AssociativeArray<K, V> {

	/**
	 * Leert das assoziative Array.
	 */
	public void clear();

	/**
	 * �berpr�ft, ob der �bergebene Wert im assoziativen Array vorkommt.
	 * 
	 * @param value
	 *            Wert, der �bergeben wird.
	 * @return boolean
	 */
	public boolean containsValue(V value);

	/**
	 * �berpr�ft, ob der �bergebene Schl�ssel im assoziativen Array vorkommt.
	 * 
	 * @param key
	 *            Schl�ssel, der �bergeben wird.
	 * @return boolean
	 */
	public boolean containsKey(K key);

	/**
	 * Gibt den passenden Wert zum �bergebenen Schl�ssel zur�ck.
	 * 
	 * @param key
	 *            Schl�ssel, der �bergeben wird.
	 * @return Wert
	 */
	public V get(K key);

	/**
	 * �berpr�ft, ob das assoziativen Array leer ist.
	 * 
	 * @return boolean
	 */
	public boolean isEmpty();

	/**
	 * Speichert den �bergebenen Schl�ssel und Wert im assoziativen Array.
	 * 
	 * @param key
	 *            Schl�ssel, der �bergeben wird.
	 * @param value
	 *            Wert, der �bergeben wird.
	 */
	public void put(K key, V value);

	/**
	 * F�gt alle Schl�ssel-Wert-Paare des �bergebenen assoziativen Arrays dem
	 * aktuellen assoziativen Array zu.
	 * 
	 * @param array
	 *            Assoziativen Array, welches �bergeben wird.
	 */
	public void putAll(AssociativeArray<K, V> array);

	/**
	 * Entfernt das Schl�ssel-Wert-Paar des �bergebenen Schl�ssels aus dem
	 * assoziativen Array und gibt den Wert zur�ck.
	 * 
	 * @param key
	 *            Schl�ssel, der �bergeben wird.
	 * @return Wert
	 */
	public V remove(K key);

	/**
	 * Gibt die Anzahl der Schl�ssel-Wert-Paare zur�ck.
	 * 
	 * @return int
	 */
	public int size();

	/**
	 * Aktualisiert den Wert des �bergebenen Schl�ssels mit dem �bergebenen
	 * Wert.
	 * 
	 * @param key
	 *            Schl�ssel, der �bergeben wird.
	 * @param value
	 *            Wert, der �bergeben wird.
	 */
	public void update(K key, V value);

	/**
	 * F�hrt den BiConsumer f�r alle Schl�ssel-Wert-Paare des assoziativen
	 * Arrays aus.
	 * 
	 * @param biConsumer
	 *            BiConsumer, der �bergeben wird.
	 */
	public void forEach(BiConsumer biConsumer);

	/**
	 * F�gt alle Schl�ssel-Wert-Paare des aktuellen assoziativen Arrays dem
	 * �bergebenen assoziativen Array hinzu.
	 * 
	 * @param array
	 *            Assoziativen Array, welches �bergeben wird.
	 */
	public void extractAll(AssociativeArray<K, V> array);

	/**
	 * F�hrt die �bergebene BiFunction f�r alle Schl�ssel-Wert-Paare des
	 * assoziativen Arrays aus und erzeugt ein neues assoziatives Array, welches
	 * die ver�nderten Werte auf die alten Schl�ssel abbildet.
	 * 
	 * @param biFunction
	 *            BiFunction, die �bergeben wird.
	 */
	public void map(BiFunction biFunction);

}