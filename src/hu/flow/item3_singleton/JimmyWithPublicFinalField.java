package hu.flow.item3_singleton;

public class JimmyWithPublicFinalField {
  public static final JimmyWithPublicFinalField INSTANCE = new JimmyWithPublicFinalField();
  private JimmyWithPublicFinalField() { };
  public void sing() {
    System.out.println("Átvirrassztott ÉJSZAKÁÁÁÁÁK!");
  }
}
