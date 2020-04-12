package hu.flow.paragraph_3.item14_implementcomparable;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import static java.util.Comparator.*;

public final class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {
  private final short areaCode, prefix, lineNum;

  public PhoneNumber(int areaCode, int prefix, int lineNum) {
    this.areaCode = rangeCheck(areaCode, 999, "area code");
    this.prefix   = rangeCheck(prefix,   999, "prefix");
    this.lineNum  = rangeCheck(lineNum, 9999, "line num");
  }

  private static short rangeCheck(int val, int max, String arg) {
    if (val < 0 || val > max)
      throw new IllegalArgumentException(arg + ": " + val);
    return (short) val;
  }

  @Override public String toString() {
    return String.format("%03d-%03d-%04d",
        areaCode, prefix, lineNum);
  }

  @Override public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof hu.flow.paragraph_3.item11_overridehashcode.PhoneNumber))
      return false;
    PhoneNumber pn = (PhoneNumber)o;
    return pn.lineNum == lineNum && pn.prefix == prefix
        && pn.areaCode == areaCode;
  }

  @Override public int hashCode() {
    int result = Short.hashCode(areaCode);
    result = 31 * result + Short.hashCode(prefix);
    result = 31 * result + Short.hashCode(lineNum);
    return result;
  }

//    // Multiple-field Comparable with primitive fields (page 69)
//    public int compareTo(PhoneNumber pn) {
//        int result = Short.compare(areaCode, pn.areaCode);
//        if (result == 0)  {
//            result = Short.compare(prefix, pn.prefix);
//            if (result == 0)
//                result = Short.compare(lineNum, pn.lineNum);
//        }
//        return result;
//    }

  // Comparable with comparator construction methods (page 70)
  private static final Comparator<PhoneNumber> COMPARATOR =
      comparingInt((PhoneNumber pn) -> pn.areaCode)
          .thenComparingInt(pn -> pn.prefix)
          .thenComparingInt(pn -> pn.lineNum);


  public int compareTo(PhoneNumber pn) {
    return COMPARATOR.compare(this, pn);
  }

  private static PhoneNumber randomPhoneNumber() {
    Random rnd = ThreadLocalRandom.current();
    return new PhoneNumber((short) rnd.nextInt(1000),
        (short) rnd.nextInt(1000),
        (short) rnd.nextInt(10000));
  }

  public static void main(String[] args) {
    NavigableSet<PhoneNumber> s = new TreeSet<PhoneNumber>();
    for (int i = 0; i < 10; i++)
      s.add(randomPhoneNumber());
    System.out.println(s);
  }
}
