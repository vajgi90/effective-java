package hu.flow.item5_dependencyinjection;

import java.util.function.Supplier;

public class Tile implements Supplier<Tile> {
  private final int size;
  private final String color;

  private Tile(int size, String color) {
    this.size = size;
    this.color = color;
  }

  @Override
  public Tile get() {
    return new Tile(size, color);
  }
}
