package hu.flow.item7_eliminateobsoleteobjectreferences;

import java.util.Arrays;

public class Stack {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public Stack() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  public Object pop() {
    if (size == 0)
      throw new EmptyStackException();
    return elements[--size];
  }

  private void ensureCapacity() {
    if (elements.length == size)
      elements = Arrays.copyOf(elements, 2 * size + 1);
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    for (String arg : args)
      stack.push(arg);

    while (true)
      System.err.println(stack.pop());
  }
}
