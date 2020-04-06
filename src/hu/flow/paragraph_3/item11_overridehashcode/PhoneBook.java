package hu.flow.paragraph_3.item11_overridehashcode;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

  private final int areaCode, prefix, lineNum;
  private int hashCode;

  public PhoneBook(int areaCode, int prefix, int lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof PhoneBook)) {
      return false;
    }
    PhoneBook pn = (PhoneBook) o;
    return pn.lineNum == lineNum && pn.prefix == prefix
        && pn.areaCode == areaCode;
  }

  //    @Override public int hashCode() {
//        return Objects.hash(lineNum, prefix, areaCode);
//    }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = Integer.hashCode(areaCode);
      result = 31 * result + Integer.hashCode(prefix);
      result = 31 * result + Integer.hashCode(lineNum);
      hashCode = result;
    }
    return result;
  }

  public static void main(String[] args) {
    Map<PhoneBook, String> m = new HashMap<>();
    m.put(new PhoneBook(707, 867, 5309), "Jenny");
    System.out.println(m.get(new PhoneBook(707, 867, 5309)));
  }
}
