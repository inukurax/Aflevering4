package spreadsheet.arithmetic;

import spreadsheet.ExpressionGenerator;
import spreadsheet.ExpressionInfo;

public class NegGenerator extends ExpressionGenerator {

	@Override
	public ExpressionInfo next() {
		final int value = this.intGen.next();
		final AConst aConst = new AConst(value);
		final Neg neg = new Neg(aConst);
		return new ExpressionInfo(neg, value, "new Neg");
	}
}
