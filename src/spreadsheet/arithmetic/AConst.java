package spreadsheet.arithmetic;

public final class AConst extends ArithmeticExpression {

  @SuppressWarnings("unused")
private int value;

  public AConst(final int value) {
    this.value = value;
  }

  @Override
  public int evaluate() {
    return 0;
//    return this.value;
  }

}
