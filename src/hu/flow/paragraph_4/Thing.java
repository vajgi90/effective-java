package hu.flow.paragraph_4;

public class Thing {
private String name;
private int piece;

  public Thing(String name, int piece) {
    this.name = name;
    this.piece = piece;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPiece() {
    return piece;
  }

  public void setPiece(int piece) {
    this.piece = piece;
  }

  @Override
  public String toString() {
    return "Thing{" +
        "name='" + name + '\'' +
        ", piece=" + piece +
        '}';
  }
}
