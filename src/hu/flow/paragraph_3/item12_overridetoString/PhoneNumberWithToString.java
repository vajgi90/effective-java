package hu.flow.paragraph_3.item12_overridetoString;

public class PhoneNumberWithToString {

  private int areaCode, prefix, lineNum;
  private int hashCode;

  public PhoneNumberWithToString(int areaCode, int prefix, int lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }

/*  @Override
  public String toString() {
    return "PhoneNumberWithToString{" +
        "areaCode=" + areaCode +
        ", prefix=" + prefix +
        ", lineNum=" + lineNum +
        ", hashCode=" + hashCode +
        '}';
  }*/

  /**
   * Returns the string representation of this phone number. The string consists of twelve
   * characters whose format is "XXX-YYY-ZZZZ", where XXX is the area code, YYY is the prefix, and
   * ZZZZ is the line number. Each of the capital letters represents a single decimal digit.
   * <p>
   * If any of the three parts of this phone number is too small to fill up its field, the field is
   * padded with leading zeros. For example, if the value of the line number is 123, the last four
   * characters of the string representation will be "0123".
   */
  @Override
  public String toString() {
    return String.format("%03d-%03d-%04d",
        areaCode, prefix, lineNum);
  }
}
