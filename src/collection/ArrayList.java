package collection;

public class ArrayList<T> implements List<T> {
    private T[] tableau=(T[])new Object[10];
    private int size=0;

    public void add(int index,T element) {
        if (index > size || index < 0) {
            System.out.println("ERREUR[ADD(INDEX,ELEMENT)]: N'EST PAS DANS LE TABLEAU");
        }
        else {
            if (size == tableau.length) {
                grow();
            }
            for (int i = size - 1; i >= index; i--) {
                tableau[i + 1] = tableau[i];
            }
            tableau[index] = element;
            size++;
        }
    }

    public void add(T element){
        if(size==tableau.length) {
            grow();
        }
        tableau[size] = element;
        size++;
    }

    public void set(int index,T element){
        if (index >= size || index < 0) {
            System.out.println("ERREUR[SET(INDEX,ELEMENT)]: N'EST PAS DANS LE TABLEAU");
        }
        else {
            tableau[index] = element;
        }
    }

    public T get(int index){
        if (index >= size || index < 0) {
            System.out.println("ERREUR[GET(INDEX)]: N'EST PAS DANS LE TABLEAU");
            return null;
        }
        else {
            return tableau[index];
        }
    }

    public void remove(int index){
        if (index > size || index < 0) {
            System.out.println("ERREUR[REMOVE(INDEX)]: N'EST PAS DANS LE TABLEAU");
        }
        else {
            size--;
            for (int i = size; i > index; i--) {
                tableau[i - 1] = tableau[i];
            }
        }
    }

    public void clear(){
        size=0;
    }

    public int size(){
        return size;
    }

    private void grow(){
        T[] tableau2=(T[])new Object[tableau.length*2];
        for(int i=0;i<size;i++){
            tableau2[i]=tableau[i];
        }
        tableau=tableau2;
    }
}
