package hu.flow.item3_singleton;

public class Main {

  public static void main(String[] args) {
    System.out.println("This is Jimmy the One, with a public static final variable:");
    JimmyWithPublicFinalField jimmy1 = JimmyWithPublicFinalField.INSTANCE;
    jimmy1.sing();
    JimmyWithPublicFinalField jimmy2 = JimmyWithPublicFinalField.INSTANCE;
    System.out.println("First hashcode: ");
    System.out.println(jimmy1.hashCode());
    System.out.println("Second hashcode: ");
    System.out.println(jimmy2.hashCode());

    System.out.println("__________________________________-");

    System.out.println("This is Jimmy the One, from a static factory:");
    JimmyWithStaticFactory jimmy3 = JimmyWithStaticFactory.getInstance();
    jimmy3.sing();
    JimmyWithStaticFactory jimmy4 = JimmyWithStaticFactory.getInstance();
    System.out.println("First hashcode: ");
    System.out.println(jimmy3.hashCode());
    System.out.println("Second hashcode: ");
    System.out.println(jimmy4.hashCode());

    System.out.println("__________________________________-");

    System.out.println("This is Jimmy the One with enum");
    JimmyWithEnum jimmy5 = JimmyWithEnum.INSTANCE;
    jimmy5.sing();
  }

}
