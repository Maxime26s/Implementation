package collection;

/**
 * Created by simma1733207 on 2018-03-19.
 */
public class Queue<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void add(T element) {
        linkedList.add(0,element);
    }

    public T remove(){
        T elementTemp = linkedList.get(size()-1);
        linkedList.remove(size()-1);
        return elementTemp;
    }

    public T peek(){
        return linkedList.get(size()-1);
    }

    public void clear(){
        linkedList.clear();
    }

    public int size(){
        return linkedList.size();
    }
}
