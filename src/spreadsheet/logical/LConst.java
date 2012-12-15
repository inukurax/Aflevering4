package spreadsheet.logical;

public final class LConst extends LogicalExpression {
  @SuppressWarnings("unused")
private boolean value;

  public LConst(final boolean value) {
    this.value = value;
  }

  @Override
  protected boolean evaluate() {
    return false;
//    return this.value;
  }
}
