package hu.flow.item5_dependencyinjection;

import java.util.Objects;
import java.util.function.Supplier;

public class Mosaic {
  private final Tile tile;

  private Mosaic(Tile tile) {
    this.tile = Objects.requireNonNull(tile);
  }

  public Mosaic create(Supplier<? extends Tile> tileFactory){
    return new Mosaic(tileFactory.get());
  }
}
