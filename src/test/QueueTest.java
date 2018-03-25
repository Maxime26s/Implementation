package test;

import collection.Queue;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
        for (int i = 0; i < 3; i++) {
            queue.add("var" + i);
        }
    }

    @org.junit.jupiter.api.Test
    void remove() {
        assertEquals("var0", queue.remove());
        assertEquals("var1", queue.remove());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        assertEquals("var0", queue.peek());
    }

    @org.junit.jupiter.api.Test
    void clear() {
        queue.clear();
        assertEquals(0, queue.size());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(3, queue.size());
    }

}