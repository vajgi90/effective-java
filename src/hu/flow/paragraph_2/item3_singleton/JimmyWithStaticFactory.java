package hu.flow.paragraph_2.item3_singleton;

public class JimmyWithStaticFactory {
  private static final JimmyWithStaticFactory INSTANCE = new JimmyWithStaticFactory();
  private JimmyWithStaticFactory(){};
  public static JimmyWithStaticFactory getInstance() { return INSTANCE;}

  public void sing() {
    System.out.println("Átvirrassztott ÉJSZAKÁÁÁÁÁK!");
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

}
