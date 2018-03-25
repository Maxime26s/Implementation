package test;

import collection.Stack;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
        for (int i = 0; i < 3; i++) {
            stack.push("var" + i);
        }
    }

    @org.junit.jupiter.api.Test
    void pop() {
        assertEquals("var2", stack.pop());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        assertEquals("var2", stack.peek());
    }

    @org.junit.jupiter.api.Test
    void clear() {
        stack.clear();
        assertEquals(0, stack.size());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(3, stack.size());
    }

}