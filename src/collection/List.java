package collection;

/**
 * Created by simma1733207 on 2018-03-19.
 */
public interface List<T> {
    void add(int index,T element);
    void add(T element);
    void set(int index,T element);
    T get(int index);
    void remove(int index);
    void clear();
    int size();
}
