package spreadsheet;

public final class Spreadsheet {

  private DynamicArrayMap map;

  public Spreadsheet() {
    this.map = new DynamicArrayMap();
  }

  /* Assume position and expression are not null. */
  public void set(final Position position, final Expression expression) {
    this.map.insert(position, expression);
  }

  /* Assume position is not null.
   * Null if the position is not associated with an expression. */
  public Expression get(final Position position) {
    return this.map.lookup(position);
  }

}
