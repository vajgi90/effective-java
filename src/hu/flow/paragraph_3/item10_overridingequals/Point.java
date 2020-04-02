package hu.flow.paragraph_3.item10_overridingequals;

public class Point {
  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override public boolean equals(Object o) {
    if (!(o instanceof Point))
      return false;
    Point p = (Point)o;
    return p.x == x && p.y == y;
  }

  @Override public int hashCode()  {
    return 31 * x + y;
  }
}
