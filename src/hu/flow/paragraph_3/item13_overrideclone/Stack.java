package hu.flow.paragraph_3.item13_overrideclone;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public Stack() {
    this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  public Object pop() {
    if (size == 0)
      throw new EmptyStackException();
    Object result = elements[--size];
    elements[size] = null;

    return result;
  }

  public boolean isEmpty() {
    return size ==0;
  }

  @Override public Stack clone() {
    try {
      Stack result = (Stack) super.clone();
      result.elements = elements.clone();
      return result;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  private void ensureCapacity() {
    if (elements.length == size)
      elements = Arrays.copyOf(elements, 2 * size + 1);
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    for (String arg : args)
      stack.push(arg);
    Stack copy = stack.clone();
    while (!stack.isEmpty())
      System.out.print(stack.pop() + " ");
    System.out.println();
    while (!copy.isEmpty())
      System.out.print(copy.pop() + " ");
  }
}
