package hu.flow.paragraph_3.item12_overridetoString;

public class PhoneNumberWithToString {
  private int areaCode, prefix, lineNum;
  private int hashCode;

  public PhoneNumberWithToString(int areaCode, int prefix, int lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }

  @Override
  public String toString() {
    return "PhoneNumberWithToString{" +
        "areaCode=" + areaCode +
        ", prefix=" + prefix +
        ", lineNum=" + lineNum +
        ", hashCode=" + hashCode +
        '}';
  }
}
