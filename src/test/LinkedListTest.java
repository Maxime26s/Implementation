package test;

import collection.LinkedList;
import collection.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by simma1733207 on 2018-03-22.
 */
class LinkedListTest {
    List linkedList;

    @BeforeEach
    void setUp() {
        linkedList=new LinkedList();
        for(int i=0;i<3;i++) {
            linkedList.add("var"+i);
        }
    }

    @Test
    void add() {
        linkedList.add(3,"var3");
        linkedList.add(1,"var4");
        assertEquals("var0", linkedList.get(0));
        assertEquals("var4", linkedList.get(1));
        assertEquals("var1", linkedList.get(2));
        assertEquals("var2", linkedList.get(3));
        assertEquals("var3", linkedList.get(4));
    }

    @Test
    void set() {
        linkedList.set(0,"newVar0");
        linkedList.set(1,"newVar1");
        assertEquals("newVar0", linkedList.get(0));
        assertEquals("newVar1", linkedList.get(1));
        assertEquals("var2", linkedList.get(2));
    }

    @Test
    void get() {
        assertEquals("var0", linkedList.get(0));
        assertEquals("var1", linkedList.get(1));
        assertEquals("var2", linkedList.get(2));
        assertEquals(null, linkedList.get(3));
    }

    @Test
    void remove() {
        linkedList.remove(1);
        assertEquals("var0", linkedList.get(0));
        assertEquals("var2", linkedList.get(1));
    }

    @Test
    void clear() {
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }

    @Test
    void size() {
        assertEquals(3, linkedList.size());
    }
}