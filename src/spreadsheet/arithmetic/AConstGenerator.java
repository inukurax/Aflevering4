package spreadsheet.arithmetic;

import spreadsheet.ExpressionGenerator;
import spreadsheet.ExpressionInfo;

public class AConstGenerator extends ExpressionGenerator {

	@Override
	public ExpressionInfo next() {
		final int value = this.intGen.next();
		final AConst aConst = new AConst(value);
		return new ExpressionInfo(aConst, value);
	}
}