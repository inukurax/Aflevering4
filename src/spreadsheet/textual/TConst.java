package spreadsheet.textual;

public final class TConst extends TextualExpression {
  @SuppressWarnings("unused")
private String value;

  public TConst(final String value) {
    this.value = value;
  }

  @Override
  protected String evaluate() {
    return null;
//    return this.value;
  }
}
