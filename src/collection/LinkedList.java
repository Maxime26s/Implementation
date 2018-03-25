package collection;

public class LinkedList<T> implements  List<T> {
    private Node head;
    private Node tail;
    private int size=0;

    public void add(int index,T element) {
        if (index > size||index<0) {
            System.out.println("ERREUR[ADD(INDEX,ELEMENT)]: N'EST PAS DANS LA CHAINE");
        }
        else if (index==size){
            add(element);
        }
        else if (index==0){
            Node tempNode1=head;
            head=new Node(element);
            head.setNext(tempNode1);
            size++;
        }

        else {
            Node tempNode1=head;
            tempNode1=nodeTravel(tempNode1,index-1);
            Node tempNode2=tempNode1.getNext();
            tempNode1.setNext(new Node(element));
            tempNode1=tempNode1.getNext();
            tempNode1.setNext(tempNode2);
            size++;
        }
    }

    public void add(T element){
        if(size==0){
            start(element);
        }
        else{
            tail.setNext(new Node(element));
            tail=tail.getNext();
        }
        size++;
    }

    public void set(int index,T element){
        if (index > size||index<0) {
            System.out.println("Nonono");
        }
        else {
            Node tempNode1 = head;
            tempNode1 = nodeTravel(tempNode1, index);
            tempNode1.setElement(element);
        }
    }

    public T get(int index){
        if (index >= size||index<0) {
            System.out.println("ERREUR[GET(INDEX)]: N'EST PAS DANS LA CHAINE");
            return null;
        }
        else {
            Node tempNode1 = head;
            tempNode1 = nodeTravel(tempNode1, index);
            return (T)tempNode1.getElement();
        }
    }

    public void remove(int index){
        if (index > size||index<0) {
            System.out.println("Nonono");
        }
        else {
            Node tempNode1 = head;
            tempNode1 = nodeTravel(tempNode1, index - 1);
            Node tempNode2 = tempNode1.getNext();
            tempNode1.setNext(tempNode2.getNext());
            size--;
        }
    }

    public void clear(){
        size=0;
    }

    public int size(){
        return size;
    }

    public Node nodeTravel(Node tempNode1, int index){
        for (int i = 0; i < index; i++) {
            tempNode1=tempNode1.getNext();
        }
        return tempNode1;
    }

    public void start(T element) {
        head = new Node(element);
        head.setNext(tail);
        tail = head;
    }
}
