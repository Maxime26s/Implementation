package collection;

/**
 * Created by simma1733207 on 2018-03-19.
 */
public class Stack<T> {
    private List<T> linkedList = new LinkedList<>();

    public void push(T element){
        linkedList.add(element);

    }

    public T pop(){
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
