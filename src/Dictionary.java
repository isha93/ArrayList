/**
 * Created by nayanda on 13/12/17.
 */
public interface Dictionary<K, V> {

    void Put(K key, V value);
    V get(K key);
    void pop(K key);
    int size();
    void clear();

}
