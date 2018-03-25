package test;

import collection.ArrayList;
import collection.List;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by simma1733207 on 2018-03-22.
 */
class ArrayListTest {
    List arrayList;
    @BeforeEach
    void setUp() {
        arrayList = new ArrayList();
        for(int i=0;i<3;i++) {
            arrayList.add("var"+i);
        }
    }

    @org.junit.jupiter.api.Test
    void add() {
        arrayList.add(3,"var3");
        arrayList.add(1,"var4");
        arrayList.add(7,"var5");
        arrayList.add(-1,"var6");
        assertEquals("var0", arrayList.get(0));
        assertEquals("var4", arrayList.get(1));
        assertEquals("var1", arrayList.get(2));
        assertEquals("var2", arrayList.get(3));
        assertEquals("var3", arrayList.get(4));
        assertEquals(null, arrayList.get(7));
        assertEquals(null, arrayList.get(-1));
    }

    @org.junit.jupiter.api.Test
    void set() {
        arrayList.set(1,"newVar1");
        arrayList.set(7,"var3");
        arrayList.set(-1,"var4");
        assertEquals("var0", arrayList.get(0));
        assertEquals("newVar1", arrayList.get(1));
        assertEquals("var2", arrayList.get(2));
        assertEquals(null, arrayList.get(7));
        assertEquals(null, arrayList.get(-1));
    }

    @org.junit.jupiter.api.Test
    void get() {
        assertEquals("var0", arrayList.get(0));
        assertEquals("var1", arrayList.get(1));
        assertEquals("var2", arrayList.get(2));
        assertEquals(null, arrayList.get(3));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        arrayList.remove(1);
        arrayList.remove(7);
        arrayList.remove(-1);
        assertEquals("var0", arrayList.get(0));
        assertEquals("var2", arrayList.get(1));
        assertEquals(null, arrayList.get(7));
        assertEquals(null, arrayList.get(-1));
    }

    @org.junit.jupiter.api.Test
    void clear() {
        arrayList.clear();
        assertEquals(0, arrayList.size());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(3, arrayList.size());
    }

    @org.junit.jupiter.api.Test
    void getAfterClear() {
        arrayList.clear();
        assertEquals(null, arrayList.get(0));
        assertEquals(null, arrayList.get(1));
        assertEquals(null, arrayList.get(2));
    }

    @org.junit.jupiter.api.Test
    void addAfterClear() {
        arrayList.clear();
        for(int i=0;i<3;i++) {
            arrayList.add("newVar"+i);
        }
        assertEquals("newVar0", arrayList.get(0));
        assertEquals("newVar1", arrayList.get(1));
        assertEquals("newVar2", arrayList.get(2));
    }

    @org.junit.jupiter.api.Test
    void grow() {
        for(int i=arrayList.size();i<15;i++) {
            arrayList.add("var"+i);
        }
        assertEquals("var12", arrayList.get(12));
        assertEquals(15, arrayList.size());
    }
}