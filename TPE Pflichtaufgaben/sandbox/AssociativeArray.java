package sandbox;

//TODO Kommentar für Interface einfügen!

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
	 * Überprüft, ob der übergebene Wert im assoziativen Array vorkommt.
	 * 
	 * @param value
	 *            Wert, der übergeben wird.
	 * @return boolean
	 */
	public boolean containsValue(V value);

	/**
	 * Überprüft, ob der übergebene Schlüssel im assoziativen Array vorkommt.
	 * 
	 * @param key
	 *            Schlüssel, der übergeben wird.
	 * @return boolean
	 */
	public boolean containsKey(K key);

	/**
	 * Gibt den passenden Wert zum übergebenen Schlüssel zurück.
	 * 
	 * @param key
	 *            Schlüssel, der übergeben wird.
	 * @return Wert
	 */
	public V get(K key);

	/**
	 * Überprüft, ob das assoziativen Array leer ist.
	 * 
	 * @return boolean
	 */
	public boolean isEmpty();

	/**
	 * Speichert den übergebenen Schlüssel und Wert im assoziativen Array.
	 * 
	 * @param key
	 *            Schlüssel, der übergeben wird.
	 * @param value
	 *            Wert, der übergeben wird.
	 */
	public void put(K key, V value);

	/**
	 * Fügt alle Schlüssel-Wert-Paare des übergebenen assoziativen Arrays dem
	 * aktuellen assoziativen Array zu.
	 * 
	 * @param array
	 *            Assoziativen Array, welches übergeben wird.
	 */
	public void putAll(AssociativeArray<K, V> array);

	/**
	 * Entfernt das Schlüssel-Wert-Paar des übergebenen Schlüssels aus dem
	 * assoziativen Array und gibt den Wert zurück.
	 * 
	 * @param key
	 *            Schlüssel, der übergeben wird.
	 * @return Wert
	 */
	public V remove(K key);

	/**
	 * Gibt die Anzahl der Schlüssel-Wert-Paare zurück.
	 * 
	 * @return int
	 */
	public int size();

	/**
	 * Aktualisiert den Wert des übergebenen Schlüssels mit dem übergebenen
	 * Wert.
	 * 
	 * @param key
	 *            Schlüssel, der übergeben wird.
	 * @param value
	 *            Wert, der übergeben wird.
	 */
	public void update(K key, V value);

	/**
	 * Führt den BiConsumer für alle Schlüssel-Wert-Paare des assoziativen
	 * Arrays aus.
	 * 
	 * @param biConsumer
	 *            BiConsumer, der übergeben wird.
	 */
	public void forEach(BiConsumer biConsumer);

	/**
	 * Fügt alle Schlüssel-Wert-Paare des aktuellen assoziativen Arrays dem
	 * übergebenen assoziativen Array hinzu.
	 * 
	 * @param array
	 *            Assoziativen Array, welches übergeben wird.
	 */
	public void extractAll(AssociativeArray<K, V> array);

	/**
	 * Führt die übergebene BiFunction für alle Schlüssel-Wert-Paare des
	 * assoziativen Arrays aus und erzeugt ein neues assoziatives Array, welches
	 * die veränderten Werte auf die alten Schlüssel abbildet.
	 * 
	 * @param biFunction
	 *            BiFunction, die übergeben wird.
	 */
	public void map(BiFunction biFunction);

}